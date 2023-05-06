package src.dynamicprogramming;

import java.util.Arrays;

public class MatrixChainMultiplication {

    public int solve(int[] A) {
        int[][] dp = new int[A.length][A.length];
        for(int[] arr: dp) {
            Arrays.fill(arr, -1);
        }
        return matrixChain(A, 1, A.length-1, dp);
    }

    public int matrixChain(int[] arr, int i, int j, int[][] dp) {
        if(i >= j) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        int totalCost = Integer.MAX_VALUE;
        for(int k=i; k<j; k++) {
            int leftMat = matrixChain(arr, i, k, dp);
            int rightMat = matrixChain(arr, k+1, j, dp);
            int cost = leftMat + rightMat + (arr[i-1] * arr[k] * arr[j]);
            totalCost = Integer.min(totalCost, cost);
            dp[i][j] = totalCost;
        }
        return dp[i][j];
    }

}
