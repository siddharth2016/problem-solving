package src.dynamicprogramming;

import java.util.Arrays;

public class InterleavingStrings {

    public int isInterleave(String A, String B, String C) {
        int[][] dp = new int[A.length()][B.length()];
        for(int[] arr: dp) {
            Arrays.fill(arr, -1);
        }
        return checkInterleave(A, B, C, 0, 0, 0, dp);
    }

    public int checkInterleave(String A, String B, String C, int i, int j, int k, int[][] dp) {
        if(i >= A.length() && j>=B.length() && k>=C.length()) return 1;
        if(k >= C.length()) return 0;
        if(i >= A.length()) {
            if(B.charAt(j) == C.charAt(k)) return checkInterleave(A, B, C, i, j+1, k+1, dp);
            else return 0;
        }
        if(j >= B.length()) {
            if(A.charAt(i) == C.charAt(k)) return checkInterleave(A, B, C, i+1, j, k+1, dp);
            else return 0;
        }
        if(dp[i][j] != -1) return dp[i][j];

        if(A.charAt(i) == B.charAt(j) && A.charAt(i) == C.charAt(k)) {
            dp[i][j] = checkInterleave(A, B, C, i+1, j, k+1, dp) | checkInterleave(A, B, C, i, j+1, k+1, dp);
        }
        else if(A.charAt(i) == C.charAt(k)) {
            dp[i][j] = checkInterleave(A, B, C, i+1, j, k+1, dp);
        }
        else if(B.charAt(j) == C.charAt(k)) {
            dp[i][j] = checkInterleave(A, B, C, i, j+1, k+1, dp);
        }
        else {
            dp[i][j] = 0;
        }
        return dp[i][j];
    }

}
