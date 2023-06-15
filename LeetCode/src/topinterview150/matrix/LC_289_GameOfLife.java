package src.topinterview150.matrix;

public class LC_289_GameOfLife {

    public void gameOfLife(int[][] board) {
        int rows = board.length;
        int cols = board[0].length;
        int[][] result = new int[rows][cols];


        int[] dx = new int[]{-1, -1, 0, 1, 1, 1, 0, -1};
        int[] dy = new int[]{0, -1, -1, -1, 0, 1, 1, 1};

        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                int lives = 0;
                for(int k=0; k<8; k++) {
                    int I = i + dx[k];
                    int J = j + dy[k];
                    if(0<=I && I<rows && 0<=J && J<cols) {
                        if(board[I][J] == 1) lives++;
                    }
                }
                int cell = board[i][j];
                if(cell == 1 && lives < 2) result[i][j] = 0;
                else if(cell == 1 && lives <= 3) result[i][j] = 1;
                else if(cell == 1) result[i][j] = 0;
                else if(cell == 0 && lives == 3) result[i][j] = 1;
                else result[i][j] = board[i][j];
            }
        }

        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                board[i][j] = result[i][j];
            }
        }

    }

}
