package src.dynamicprogramming;

import java.util.Arrays;

public class WaysToDecode {

    int[] dp;
    int mod;
    public int numDecodings(String A) {
        dp = new int[A.length()];
        Arrays.fill(dp, -1);
        mod = (int)Math.pow(10, 9) + 7;
        return solve(A, 0);
    }

    public int solve(String str, int index) {
        if(index == str.length()) return 1;
        if(str.charAt(index) == '0') return 0;
        if(dp[index] != -1) return dp[index];

        int singleDigitWays = solve(str, index+1);
        if(index + 1 != str.length() && (
                str.charAt(index) == '1' || (str.charAt(index) == '2' &&
                        '0' <= str.charAt(index+1) && str.charAt(index+1) <= '6'))) {
            singleDigitWays = (singleDigitWays % mod + solve(str, index + 2) % mod) % mod;
        }
        dp[index] = singleDigitWays % mod;
        return dp[index];
    }

}
