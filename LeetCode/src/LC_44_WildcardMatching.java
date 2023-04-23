package src;

import java.util.Arrays;

public class LC_44_WildcardMatching {

    int[][] dp;
    public boolean isMatch(String s, String p) {
        dp = new int[s.length()][p.length()];
        for(int[] arr: dp) {
            Arrays.fill(arr, -1);
        }
        return matchFound(s, p, s.length()-1, p.length()-1, dp);
    }

    public boolean matchFound(String s, String p, int i, int j, int[][] dp) {
        if(i < 0 && j < 0) return true;
        if(i < 0) {
            if(p.charAt(j) == '*') return matchFound(s, p, i, j-1, dp);
            else return false;
        }
        if(j < 0) return false;
        if(dp[i][j] == 0) return false;
        if(dp[i][j] == 1) return true;
        boolean found = true;
        if(s.charAt(i) == p.charAt(j)) found = matchFound(s, p, i-1, j-1, dp);
        else if(p.charAt(j) == '*') {
            found = matchFound(s, p, i-1, j, dp) || matchFound(s, p, i, j-1, dp);
        }
        else if(p.charAt(j) == '?') {
            found = matchFound(s, p, i-1, j-1, dp);
        }
        else if(s.charAt(i) != p.charAt(j)) return false;

        if(found) dp[i][j] = 1;
        else dp[i][j] = 0;
        return found;
    }

}
