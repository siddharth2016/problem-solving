package src.dynamicprogramming;

import java.util.Arrays;

public class Knapsack01 {

    int[][] dp;
    public int solve(int[] A, int[] B, int C) {
        dp = new int[A.length+1][C+1];
        for(int[] arr: dp) {
            Arrays.fill(arr, -1);
        }
        return findMaxKnapsack(A, B, C, A.length, dp);
    }

    public int findMaxKnapsack(int[] values, int[] weights, int cap, int n, int[][] dp) {
        if(n == 0 || cap == 0) return 0;
        if(dp[n][cap] != -1) return dp[n][cap];
        int include = 0;
        if(weights[n - 1] <= cap) {
            include = values[n-1] + findMaxKnapsack(values, weights, cap - weights[n-1], n-1, dp);
        }
        int exclude = findMaxKnapsack(values, weights, cap, n-1, dp);
        dp[n][cap] = Integer.max(include, exclude);
        return dp[n][cap];
    }

}
