package src.problems;

import java.util.Arrays;

public class LC_10_RegularExpressionMatching {

    int[][] dp;
    public boolean isMatch(String s, String p) {
        dp = new int[s.length()][p.length()];
        for(int[] arr: dp) {
            Arrays.fill(arr, -1);
        }
        return matchFound(s, p, 0, 0, dp);
    }
    public boolean matchFound(String s, String p, int i, int j, int[][] dp) {
        if(i >= s.length() && j >= p.length()) return true;
        if(i >= s.length()) {
            if(j + 1 < p.length() && p.charAt(j+1) == '*') {
                return matchFound(s, p, i, j+2, dp);
            }
            else return false;
        }
        if(j >= p.length()) return false;
        if(dp[i][j] == 0) return false;
        if(dp[i][j] == 1) return true;
        boolean found = true;
        if(j + 1 < p.length() && p.charAt(j+1) == '*') {
            found = matchFound(s, p, i, j+2, dp);
            if(s.charAt(i) == p.charAt(j) || p.charAt(j) == '.') found = found || matchFound(s, p, i+1, j, dp);
        }
        else if(s.charAt(i) == p.charAt(j) || p.charAt(j) == '.') {
            found = matchFound(s, p, i+1, j+1, dp);
        }
        else return false;

        if(found) dp[i][j] = 1;
        else dp[i][j] = 0;
        return found;
    }

}
