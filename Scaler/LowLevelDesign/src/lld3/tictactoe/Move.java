package src.lld3.tictactoe;

public class Move {

    private int row;
    private int col;
    private Integer symbol;

    public Move(int row, int col, Integer symbol) {
        this.row = row;
        this.col = col;
        this.symbol = symbol;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public Integer getSymbol() {
        return symbol;
    }

    public void setSymbol(Integer symbol) {
        this.symbol = symbol;
    }
}
