package src.problems;

public class LC_338_CountingBits {

    public int[] countBits(int n) {
        if(n == 0) return new int[]{0};
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        int mod = 2;
        int i = 2;
        while(i <= n) {
            int itr = 0;
            while(i <= n && itr < mod) {
                dp[i] = dp[i%mod] + 1;
                i++; itr++;
            }
            mod = i;
        }
        return dp;
    }

}
