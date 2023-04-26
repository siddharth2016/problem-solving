package src.dynamicprogramming;

import java.util.Arrays;

public class Knapsack01Part2 {

    public int solve(int[] A, int[] B, int C) {
        int[][] dp = new int[2][C+1];
        Arrays.fill(dp[0], 0);
        for(int i=0; i<B.length; i++) {
            for(int j=0; j<=C; j++) {
                if(j == 0) dp[1][j] = 0;
                else {
                    if(B[i] <= j) {
                        dp[1][j] = Integer.max(dp[0][j], A[i] + dp[0][j-B[i]]);
                    }
                    else {
                        dp[1][j] = dp[0][j];
                    }
                }
            }
            dp[0] = dp[1];
            dp[1] = new int[C+1];
        }
        return dp[0][C];
    }

}
