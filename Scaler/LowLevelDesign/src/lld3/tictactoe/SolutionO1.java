package src.lld3.tictactoe;

import java.util.HashMap;
import java.util.Map;

public class SolutionO1 implements SolutionStrategy {


    private final Map<Integer, Map<Integer, Integer>> rowMap = new HashMap<>();
    private final Map<Integer, Map<Integer, Integer>> colMap = new HashMap<>();
    private final Map<Integer, Integer> dia1Map = new HashMap<>();
    private final Map<Integer, Integer> dia2Map = new HashMap<>();


    @Override
    public WinStatus isWinner(Board board, Move move) {
        int row = move.getRow();
        int col = move.getCol();
        int symbol = move.getSymbol();

        int rows = board.getRows();
        int cols = board.getCols();

        if(board.getMoves() == rows * cols) return WinStatus.DRAW;

        //check for rows
        if(!rowMap.containsKey(row)) rowMap.put(row, new HashMap<>());
        Map<Integer, Integer> tempMap = rowMap.get(row);
        if(!tempMap.containsKey(symbol)) tempMap.put(symbol, 0);
        tempMap.put(symbol, tempMap.get(symbol) + 1);
        if(rows == tempMap.get(symbol)) return WinStatus.WON;

        //check for cols
        if(!colMap.containsKey(col)) colMap.put(col, new HashMap<>());
        tempMap = colMap.get(col);
        if(!tempMap.containsKey(symbol)) tempMap.put(symbol, 0);
        tempMap.put(symbol, tempMap.get(symbol) + 1);
        if(cols == tempMap.get(symbol)) return WinStatus.WON;

        //check for dia1
        if(row == col) {
            if (!dia1Map.containsKey(symbol)) dia1Map.put(symbol, 0);
            dia1Map.put(symbol, dia1Map.get(symbol) + 1);
            if (rows == dia1Map.get(symbol)) return WinStatus.WON;
        }

        //check for rows
        if(row == cols - 1 - col) {
            if (!dia2Map.containsKey(symbol)) dia2Map.put(symbol, 0);
            dia2Map.put(symbol, dia2Map.get(symbol) + 1);
            if (rows == dia2Map.get(symbol)) return WinStatus.WON;
        }

        return WinStatus.NOT_YET;
    }

    public void undoMove(Board board, Move move) {
        int row = move.getRow();
        int col = move.getCol();
        int symbol = move.getSymbol();

        int rows = board.getRows();
        int cols = board.getCols();

        rowMap.get(row).put(symbol, rowMap.get(row).get(symbol) - 1);
        colMap.get(col).put(symbol, rowMap.get(col).get(symbol) - 1);

        if(row == col) {
            dia1Map.put(symbol, dia1Map.get(symbol) - 1);
        }
        if(row == cols - 1 - col) {
            dia2Map.put(symbol, dia2Map.get(symbol) - 1);
        }
    }
}
