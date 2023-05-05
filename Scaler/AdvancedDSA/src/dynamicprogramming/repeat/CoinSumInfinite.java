package src.dynamicprogramming.repeat;
public class CoinSumInfinite {
    public int coinchange2(int[] A, int B) {
        int[][] dp = new int[2][B+1];
        dp[0][0] = 1;
        int mod = (int)Math.pow(10, 6) + 7;
        for(int i=0; i<A.length; i++) {
            for(int j=0; j<=B; j++) {
                if(j == 0) dp[1][j] = 1;
                else if(A[i] <= j) {
                    dp[1][j] = (dp[1][j-A[i]] % mod + dp[0][j] % mod) % mod;
                }
                else {
                    dp[1][j] = dp[0][j];
                }
            }
            dp[0] = dp[1];
            dp[1] = new int[B+1];
        }
        return dp[0][B];
    }

}
