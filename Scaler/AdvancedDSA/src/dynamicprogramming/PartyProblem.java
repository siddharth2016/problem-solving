package src.dynamicprogramming;

public class PartyProblem {

    public int solve(int A) {
        int[] dp = new int[A+1];
        dp[0] = 1;
        dp[1] = 1;
        int mod = (int)Math.pow(10, 4) + 3;
        for(int i=2; i<=A; i++) {
            dp[i] = (dp[i-1] % mod + (i-1) % mod * dp[i-2] % mod) % mod;
        }
        return dp[A];
    }

}
