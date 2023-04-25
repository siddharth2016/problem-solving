package src.dynamicprogramming;

import java.util.Arrays;

public class NDigitNumbers {

    public int solve(int A, int B) {
        int[][] dp = new int[A+1][B+1];
        for(int[] arr: dp) {
            Arrays.fill(arr, -1);
        }
        int ans = 0;
        int mod = (int)Math.pow(10, 9) + 7;
        for(int i=1; i<10; i++) {
            ans = (ans % mod + digitSumWays(A-1, B-i, dp, mod) % mod) % mod;
        }
        return ans;
    }

    public int digitSumWays(int digits, int sum, int[][] dp, int mod) {
        if(digits < 0 || sum < 0) return 0;
        if(digits == 0 && sum == 0) return 1;
        if(dp[digits][sum] != -1) return dp[digits][sum];

        int ans = 0;
        for(int i=0; i<10; i++) {
            ans = (ans % mod + digitSumWays(digits-1, sum-i, dp, mod) % mod) % mod;
        }
        dp[digits][sum] = ans;
        return dp[digits][sum];
    }

}
