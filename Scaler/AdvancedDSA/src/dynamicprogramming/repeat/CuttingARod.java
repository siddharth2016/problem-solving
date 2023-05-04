package src.dynamicprogramming.repeat;

import java.util.Arrays;

public class CuttingARod {

    public int solve(int[] A) {
        int[][] dp = new int[A.length+1][A.length+1];
        for(int[] arr: dp) {
            Arrays.fill(arr, -1);
        }
        return findMaxCost(A, A.length, A.length, dp);
    }
    public int findMaxCost(int[] values, int n, int cap, int[][] dp) {
        if(n == 0 || cap == 0) return 0;
        if(dp[n][cap] != -1) return dp[n][cap];

        int include = 0;
        if(n <= cap) {
            include = values[n-1] + findMaxCost(values, n, cap-n, dp);
        }
        int exclude = findMaxCost(values, n-1, cap, dp);
        dp[n][cap] = Integer.max(include, exclude);
        return dp[n][cap];
    }
}
