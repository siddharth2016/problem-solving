package src.dynamicprogramming;

public class MinSumPathInMatrix {

    public int minPathSum(int[][] A) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] dp = new int[rows][cols];
        dp[0][0] = A[0][0];
        for(int j=1; j<cols; j++) {
            dp[0][j] = dp[0][j-1] + A[0][j];
        }
        for(int i=1; i<rows; i++) {
            dp[i][0] = dp[i-1][0] + A[i][0];
        }
        for(int i=1; i<rows; i++) {
            for(int j=1; j<cols; j++) {
                dp[i][j] = Math.min(dp[i-1][j]+A[i][j], dp[i][j-1]+A[i][j]);
            }
        }
        return dp[rows-1][cols-1];
    }

}
