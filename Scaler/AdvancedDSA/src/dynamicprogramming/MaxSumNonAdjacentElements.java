package src.dynamicprogramming;

import java.util.Arrays;

public class MaxSumNonAdjacentElements {

    public int adjacent(int[][] A) {
        int[] dp = new int[A[0].length];
        int[] arr = new int[A[0].length];
        for(int i=0; i<A[0].length; i++) {
            arr[i] = Integer.max(A[0][i], A[1][i]);
        }
        Arrays.fill(dp, -1);
        return maxNonAdj(arr, 0, dp);
    }

    public int maxNonAdj(int[] arr, int index, int[] dp) {
        if(index >= arr.length) return 0;
        if(dp[index] != -1) return dp[index];
        int with = maxNonAdj(arr, index + 2, dp) + arr[index];
        int without = maxNonAdj(arr, index + 1, dp);
        dp[index] = Integer.max(with, without);
        return dp[index];
    }

}
