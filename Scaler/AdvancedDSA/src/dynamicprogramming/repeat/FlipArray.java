package src.dynamicprogramming.repeat;

import java.util.Arrays;

public class FlipArray {

    public int solve(final int[] A) {
        int sum = 0;
        for(int val: A) {
            sum += val;
        }
        sum /= 2;
        int ans = A.length;
        int[][] dp = new int[A.length+1][sum+1];
        for(int[] arr: dp) {
            Arrays.fill(arr, -1);}
        for(int val=sum; val>=1; val--) {
            ans = findMinNum(A, A.length, val, dp);
            if(ans <= A.length) break;
        }
        return ans;
    }

    public int findMinNum(int[] weights, int n, int cap, int[][] dp) {
        if(cap == 0) return 0;
        if(n <= 0) return weights.length + 1;
        if(dp[n][cap] != -1) return dp[n][cap];

        if(weights[n-1] <= cap) {
            dp[n][cap] = Integer.min(findMinNum(weights, n-1, cap, dp),
                    1+findMinNum(weights, n-1, cap-weights[n-1], dp));
        }
        else {
            dp[n][cap] = findMinNum(weights, n-1, cap, dp);
        }

        return dp[n][cap];
    }

}
