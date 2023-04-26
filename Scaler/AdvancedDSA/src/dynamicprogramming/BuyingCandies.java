package src.dynamicprogramming;

import java.util.Arrays;

public class BuyingCandies {

    public int solve(int[] A, int[] B, int[] C, int D) {
        for(int i=0; i<A.length; i++) {
            B[i] = A[i] * B[i];
        }
        int[][] dp = new int[B.length+1][D+1];
        for(int[] arr: dp) {
            Arrays.fill(arr, -1);
        }
        return findMaxSweetness(B, C, B.length, D, dp);
    }

    public int findMaxSweetness(int[] values, int[] weights, int n, int cap, int[][] dp) {
        if(n == 0 || cap == 0) return 0;
        if(dp[n][cap] != -1) return dp[n][cap];

        int include = 0;
        if(weights[n-1] <= cap) {
            include = values[n-1] + findMaxSweetness(values, weights, n, cap-weights[n-1], dp);
        }
        int exclude = findMaxSweetness(values, weights, n-1, cap, dp);
        dp[n][cap] = Integer.max(include, exclude);
        return dp[n][cap];
    }

}
