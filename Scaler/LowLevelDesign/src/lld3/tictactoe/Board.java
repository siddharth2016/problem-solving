package src.lld3.tictactoe;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private int rows;
    private int cols;
    private int moves;

    private List<List<Integer>> board;

    public Board(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.moves = 0;
        this.board = new ArrayList<>();

        for(int i=0; i<rows; i++) {
            List<Integer> temp = new ArrayList<>();
            for(int j=0; j<cols; j++) {
                temp.add(-1);
            }
            this.board.add(temp);
        }
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public List<List<Integer>> getBoard() {
        return board;
    }

    public int getMoves() {
        return moves;
    }

    public void setMoves(int moves) {
        this.moves = moves;
    }

    public void printBoard() {
        for(int i=0; i<this.rows; i++) {
            for(int j=0; j<this.cols; j++) {
                System.out.printf("|" + this.board.get(i).get(j) + "| ");
            }
            System.out.println();
        }
    }

    public boolean validMove(Move move) {
        int row = move.getRow();
        int col = move.getCol();
        return row >= 0 && row < this.rows && col >= 0 && col < this.cols && this.board.get(row).get(col) == -1;
    }

    public void makeMove(Move move) {
        this.board.get(move.getRow()).set(move.getCol(), move.getSymbol());
        this.moves += 1;
    }

    public void undoMove(Move move) {
        this.board.get(move.getRow()).set(move.getCol(), -1);
        this.moves -= 1;
    }
}
