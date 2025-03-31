package src.lld3.tictactoe;

import java.util.List;

public class SolutionON2 implements SolutionStrategy {

    @Override
    public WinStatus isWinner(Board board, Move move) {
        List<List<Integer>> mat = board.getBoard();
        int rows = board.getRows();
        int cols = board.getCols();

        for(int i=0; i<rows; i++) {
            int count = 0;
            for(int j=0; j<cols; j++) {
                if(!mat.get(i).get(j).equals(-1)) count++;
            }
            if(count == rows*cols) return WinStatus.DRAW;
        }

        for(int i=0; i<rows; i++) {
            int count = 0;
            for(int j=0; j<cols; j++) {
                if(mat.get(i).get(j).equals(move.getSymbol())) count++;
            }
            if(count == cols) return WinStatus.WON;
        }

        for(int j=0; j<cols; j++) {
            int count = 0;
            for(int i=0; i<rows; i++) {
                if(mat.get(i).get(j).equals(move.getSymbol())) count++;
            }
            if(count == rows) return WinStatus.WON;
        }

        int count1 = 0;
        int count2 = 0;
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                if(i==j && mat.get(i).get(j).equals(move.getSymbol())) count1++;
                else if(i == cols - 1 - j && mat.get(i).get(j).equals(move.getSymbol())) count2++;
            }
            if(count1 == rows || count2 == rows) return WinStatus.WON;
        }

        return WinStatus.NOT_YET;
    }

    @Override
    public void undoMove(Board board, Move move) {

    }

}
