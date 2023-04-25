package src.dynamicprogramming;

public class DungeonPrincess {

    public int calculateMinimumHP(int[][] A) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] dp = new int[A.length][A[0].length];
        for(int i=rows-1; i>=0; i--) {
            for(int j=cols-1; j>=0; j--) {
                if(i == rows - 1 && j == cols - 1) {
                    dp[i][j] = Math.min(0, A[i][j]);
                }
                else if(i == rows - 1) {
                    dp[i][j] = Math.min(0, dp[i][j+1] + A[i][j]);
                }
                else if(j == cols - 1) {
                    dp[i][j] = Math.min(0, dp[i+1][j] + A[i][j]);
                }
                else {
                    dp[i][j] = Math.min(0, Math.max(dp[i+1][j]+A[i][j], dp[i][j+1]+A[i][j]));
                }
            }
        }
        return Math.abs(dp[0][0]) + 1;
    }

}
