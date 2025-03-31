package src.lld3.tictactoe;

import java.util.List;

public class SolutionON implements SolutionStrategy {

    @Override
    public WinStatus isWinner(Board board, Move move) {
        int row = move.getRow();
        int col = move.getCol();
        int symbol = move.getSymbol();

        int rows = board.getRows();
        int cols = board.getCols();

        if(board.getMoves() == rows * cols) return WinStatus.DRAW;

        List<List<Integer>> mat = board.getBoard();

        int count = 0;
        for(int j=0; j<board.getCols(); j++) {
            if(board.getBoard().get(row).get(j) == symbol) count++;
        }
        if(count == board.getCols()) return WinStatus.WON;

        count = 0;
        for(int i=0; i<board.getRows(); i++) {
            if(board.getBoard().get(i).get(col) == symbol) count++;
        }
        if(count == board.getCols()) return WinStatus.WON;

        if(row == col) {
            int i = 0;
            int j = 0;
            count = 0;
            while(i < rows && j < cols) {
                if(mat.get(i).get(j) == symbol) count++;
                i++; j++;
            }
            if(count == rows) return WinStatus.WON;
        }

        if(row == board.getCols() - 1 - col) {
            int i = 0;
            int j = cols-1;
            count = 0;
            while(i < rows && j >= 0) {
                if(mat.get(i).get(j) == symbol) count++;
                i++; j--;
            }
            if(count == rows) return WinStatus.WON;
        }

        return WinStatus.NOT_YET;
    }

    @Override
    public void undoMove(Board board, Move move) {

    }

}
