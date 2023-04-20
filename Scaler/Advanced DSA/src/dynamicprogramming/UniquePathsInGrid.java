package src.dynamicprogramming;

public class UniquePathsInGrid {

    // Bottom Up Approach
    public int[][] createDPArray(int[][] arr) {
        int[][] result = new int[arr.length][arr[0].length];
        result[0][0] = 1;
        int temp = 1;
        for(int j=1; j<arr[0].length; j++) {
            if(arr[0][j] == 1) temp = 0;
            result[0][j] = temp;
        }
        temp = 1;
        for(int i=1; i<arr.length; i++) {
            if(arr[i][0] == 1) temp = 0;
            result[i][0] = temp;
        }
        return result;
    }

    public int uniquePathsWithObstacles(int[][] A) {
        if(A[0][0] == 1) return 0;
        int[][] dp = createDPArray(A);
        for(int i=1; i<A.length; i++) {
            for(int j=1; j<A[0].length; j++) {
                if(A[i][j] != 1) {
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }
        return dp[A.length-1][A[0].length - 1];
    }



}
