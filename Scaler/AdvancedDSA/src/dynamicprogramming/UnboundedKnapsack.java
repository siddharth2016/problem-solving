package src.dynamicprogramming;

import java.util.Arrays;

public class UnboundedKnapsack {

    public int solve(int A, int[] B, int[] C) {
        int[][] dp = new int[B.length+1][A+1];
        for(int[] arr: dp) {
            Arrays.fill(arr, -1);
        }
        return findMaxKnapsack(B, C, B.length, A, dp);
    }

    public int findMaxKnapsack(int[] values, int[] weights, int n, int cap, int[][] dp) {
        if(n == 0 || cap == 0) return 0;
        if(dp[n][cap] != -1) return dp[n][cap];

        int include = 0;
        if(weights[n-1] <= cap) {
            include = values[n-1] + findMaxKnapsack(values, weights, n, cap-weights[n-1], dp);
        }
        int exclude = findMaxKnapsack(values, weights, n-1, cap, dp);
        dp[n][cap] = Integer.max(include, exclude);
        return dp[n][cap];
    }

}
