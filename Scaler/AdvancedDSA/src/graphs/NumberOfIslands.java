package src.graphs;

public class NumberOfIslands {

    public int solve(int[][] A) {
        int[][] visited = new int[A.length][A[0].length];
        int countIsLands = 0;
        for(int i=0; i<A.length; i++) {
            for(int j=0; j<A[0].length; j++) {
                if(visited[i][j] == 0 && A[i][j] == 1) {
                    dfs(A, visited, i, j);
                    countIsLands++;
                }
            }
        }
        return countIsLands;
    }

    public void dfs(int[][] arr, int[][] visited, int i, int j) {
        if(i >= arr.length || j >= arr[0].length ||
                i < 0 || j < 0 || arr[i][j] == 0 || visited[i][j] == 1) return;

        visited[i][j] = 1;
        int[] dx = new int[]{-1, 0, 1, 0, -1, 1, -1, 1};
        int[] dy = new int[]{0, -1, 0, 1, -1, 1, 1, -1};
        for(int k=0; k<dx.length; k++) {
            dfs(arr, visited, i+dx[k], j+dy[k]);
        }
    }

}
