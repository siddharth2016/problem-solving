package src.dynamicprogramming;

public class IntersectingCordsInACircle {

    public int chordCnt(int A) {
        long[] dp = new long[A+1];
        dp[0] = 1L;
        dp[1] = 1L;
        long mod = (long)Math.pow(10, 9) + 7L;
        for(int i=2; i<=A; i++) {
            long val = 0L;
            for(int j=0; j<i; j++) {
                val = (val % mod + (dp[j] % mod * dp[i-j-1] % mod) % mod) % mod;
            }
            dp[i] = val;
        }
        return (int)dp[A];
    }

}
