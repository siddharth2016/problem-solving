package src.backtracking;

import java.util.ArrayList;

public class UniquePaths3 {

    int[][] visited;
    int starti;
    int startj;
    public int solve(int[][] A) {
        int nonObs = 0;
        starti = 0;
        startj = 0;
        for(int i=0; i<A.length; i++) {
            for(int j=0; j<A[0].length; j++) {
                if(A[i][j] == 0) nonObs++;
                else if(A[i][j] == 1) {
                    starti = i;
                    startj = j;
                }
            }
        }
        visited = new int[A.length][A[0].length];
        visited[starti][startj] = 1;
        return countWays(A, nonObs, starti, startj, A.length, A[0].length, new ArrayList<>());
    }

    public int countWays(int[][] arr, int nonObs, int i, int j, int rows, int cols, ArrayList<String> temp) {
        int val = arr[i][j];

        if (val == 0) {
            temp.add(i + "@" + j);
            visited[i][j] = 1;
        } else if (val == -1) {
            return 0;
        } else if (val == 2) {
            if (nonObs == temp.size()) return 1;
            else return 0;
        }

        int rightWays = 0;
        int leftWays = 0;
        int topWays = 0;
        int bottomWays = 0;

        if (j + 1 < cols && visited[i][j + 1] != 1) rightWays = countWays(arr, nonObs, i, j + 1, rows, cols, temp);
        if (j - 1 >= 0 && visited[i][j - 1] != 1) leftWays = countWays(arr, nonObs, i, j - 1, rows, cols, temp);
        if (i + 1 < rows && visited[i + 1][j] != 1) topWays = countWays(arr, nonObs, i + 1, j, rows, cols, temp);
        if (i - 1 >= 0 && visited[i - 1][j] != 1) bottomWays = countWays(arr, nonObs, i - 1, j, rows, cols, temp);

        if (val == 0) {
            visited[i][j] = 0;
            temp.remove(temp.size() - 1);
        }

        return rightWays + leftWays + topWays + bottomWays;
    }
}
