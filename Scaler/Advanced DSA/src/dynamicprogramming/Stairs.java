package src.dynamicprogramming;

public class Stairs {

    public int climbStairs(int A) {
        int[] dp = new int[A];
        int mod = (int)Math.pow(10, 9) + 7;
        for(int i=0; i<A; i++) {
            if(i == 0) dp[i] = 1;
            else if(i == 1) dp[i] = 2;
            else dp[i] = (dp[i-1] % mod + dp[i-2] % mod) % mod;
        }
        return dp[A-1] % mod;
    }

}
