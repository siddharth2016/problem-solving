package src.graphs;

public class ValidPath {

    public String solve(int A, int B, int C, int D, int[] E, int[] F) {
        int[][] mat = new int[101][101];
        for(int circle=0; circle<C; circle++) {
            fillMatWithCircle(mat, E[circle], F[circle], D);
        }
        int[][] visited = new int[A+1][B+1];
        dfs(mat, visited, A, B, 0, 0);
        if(visited[A][B] == 1) return "YES";
        return "NO";
    }

    public void dfs(int[][] arr, int[][] visited, int rows, int cols, int i, int j) {
        if(i > rows || j > cols ||
                i < 0 || j < 0 || arr[i][j] == -1 || visited[i][j] == 1) return;

        visited[i][j] = 1;
        int[] dx = new int[]{-1, 0, 1, 0, -1, 1, -1, 1};
        int[] dy = new int[]{0, -1, 0, 1, -1, 1, 1, -1};
        for(int k=0; k<dx.length; k++) {
            dfs(arr, visited, rows, cols, i+dx[k], j+dy[k]);
        }
    }

    public void fillMatWithCircle(int[][] mat, int x, int y, int radius) {

        for(int i=x; i>=0 && i>=x-radius; i--) {
            mat[i][y] = -1;
        }

        for(int i=x; i<mat.length && i<=x+radius; i++) {
            mat[i][y] = -1;
        }

        for(int j=y; j>=0 && j>=y-radius; j--) {
            mat[x][j] = -1;
        }

        for(int j=y; j<mat[0].length && j<=y+radius; j++) {
            mat[x][j] = -1;
        }

        for(int i=x; i>=0 && i>x-radius; i--) {
            for(int j=y; j<mat[0].length && j<y+radius; j++) {
                mat[i][j] = -1;
            }
        }

        for(int i=x; i>=0 && i>x-radius; i--) {
            for(int j=y; j>=0 && j>y-radius; j--) {
                mat[i][j] = -1;
            }
        }

        for(int i=x; i<mat.length && i<x+radius; i++) {
            for(int j=y; j<mat[0].length && j<y+radius; j++) {
                mat[i][j] = -1;
            }
        }

        for(int i=x; i<mat.length && i<x+radius; i++) {
            for(int j=y; j>=0 && j>y-radius; j--) {
                mat[i][j] = -1;
            }
        }
    }

}
