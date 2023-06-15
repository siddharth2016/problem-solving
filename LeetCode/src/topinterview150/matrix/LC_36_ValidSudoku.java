package src.topinterview150.matrix;

public class LC_36_ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                if(!valid(board, i, j)) return false;
            }
        }
        return true;
    }

    public boolean valid(char[][] board, int i, int j) {
        if(board[i][j] == '.') return true;

        char chr = board[i][j];

        for(int row=0; row<9; row++) {
            if(row != i && board[row][j] == chr) return false;
        }

        for(int col=0; col<9; col++) {
            if(col != j && board[i][col] == chr) return false;
        }

        int starti = (i/3)*3;
        int startj = (j/3)*3;

        for(int row=starti; row<starti+3; row++) {
            for(int col=startj; col<startj+3; col++) {
                if(i != row && j != col && board[row][col] == chr) return false;
            }
        }
        return true;
    }

}
