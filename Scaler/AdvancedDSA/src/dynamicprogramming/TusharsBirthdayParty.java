package src.dynamicprogramming;

import java.util.Arrays;

public class TusharsBirthdayParty {

    public int solve(final int[] A, final int[] B, final int[] C) {
        int[][] dp = new int[B.length+1][1001];
        for(int[] arr: dp) {
            Arrays.fill(arr, -1);
        }
        int ans = 0;
        for(int val: A) {
            ans += findMinCost(C, B, B.length, val, dp);
        }
        return ans;
    }

    public int findMinCost(int[] values, int[] weights, int n, int cap, int[][] dp) {
        if(cap == 0) return 0;
        if(n <= 0) return 1000001;
        if(dp[n][cap] != -1) return dp[n][cap];

        if(weights[n-1] <= cap) {
            int include = Integer.min(values[n-1] + findMinCost(values, weights, n, cap-weights[n-1], dp),
                    findMinCost(values, weights, n-1, cap, dp)
            );
            dp[n][cap] = include;
        }
        else {
            int exclude = findMinCost(values, weights, n-1, cap, dp);
            dp[n][cap] = exclude;
        }
        return dp[n][cap];
    }

}
