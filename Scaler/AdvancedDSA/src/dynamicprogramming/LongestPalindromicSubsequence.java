package src.dynamicprogramming;

import java.util.Arrays;

public class LongestPalindromicSubsequence {

    public int solve(String A) {
        int[][] dp = new int[A.length()][A.length()];
        for(int[] arr: dp) {
            Arrays.fill(arr, -1);
        }
        return longestPalin(A, 0, A.length()-1, dp);
    }

    public int longestPalin(String A, int i, int j, int[][] dp) {
        if(i > j) return 0;
        if(i == j) return 1;
        if(dp[i][j] != -1) return dp[i][j];

        if(A.charAt(i) == A.charAt(j)) {
            dp[i][j] = Integer.max(dp[i][j], longestPalin(A, i+1, j-1, dp) + 2);
        }
        else {
            dp[i][j] = Integer.max(dp[i][j], Integer.max(longestPalin(A, i+1, j, dp), longestPalin(A, i, j-1, dp)));
        }

        return dp[i][j];

    }

}
