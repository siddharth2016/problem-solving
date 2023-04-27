package src.dynamicprogramming;

import java.util.Arrays;

public class DistinctSubsequences {

    public int numDistinct(String A, String B) {
        int[][] dp = new int[A.length()+1][B.length()+1];
        for(int[] arr: dp) {
            Arrays.fill(arr, -1);
        }
        return numOfDistinctWays(A, B, 0, 0, dp);
    }

    public int numOfDistinctWays(String A, String B, int i, int j, int[][] dp) {
        if(j >= B.length()) return 1;
        if(i >= A.length()) return 0;
        if(dp[i][j] != -1) return dp[i][j];

        if(A.charAt(i) == B.charAt(j)) {
            dp[i][j] = numOfDistinctWays(A, B, i+1, j+1, dp) + numOfDistinctWays(A, B, i+1, j, dp);
        }
        else {
            dp[i][j] = numOfDistinctWays(A, B, i+1, j, dp);
        }

        return dp[i][j];
    }

}
