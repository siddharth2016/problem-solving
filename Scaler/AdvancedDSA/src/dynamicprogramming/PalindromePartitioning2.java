package src.dynamicprogramming;

import java.util.Arrays;

public class PalindromePartitioning2 {

    public int minCut(String A) {
        int[][] dp = new int[A.length()][A.length()];
        for(int[] arr: dp) {
            Arrays.fill(arr, -1);
        }
        return countCuts(A, 0, A.length()-1, dp);
    }

    public int countCuts(String A, int i, int j, int[][] dp) {
        if(i == j) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        if(palin(A, i, j)) {
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        int count = 0;
        for(int k=i; k<j; k++) {
            count = 1 + countCuts(A, i, k, dp) + countCuts(A, k+1, j, dp);
            ans = Integer.min(ans, count);
        }
        dp[i][j] = ans;
        return dp[i][j];
    }

    public boolean palin(String A, int start, int end) {
        boolean isPalin = true;
        while(start <= end) {
            if(A.charAt(start) != A.charAt(end)) {
                isPalin = false;
                break;
            }
            start++; end--;
        }
        return isPalin;
    }

}
