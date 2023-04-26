package src.dynamicprogramming;

import java.util.Arrays;

public class FlipArray {

    public int solve(final int[] A) {
        int sum = Arrays.stream(A).sum();
        sum = sum/2;
        int n = A.length;

        int[][] dp = new int[n+1][sum+1];

        for(int j = 1;j<=sum;j++){
            dp[0][j] = 9999999;
        }

        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=sum;j++){
                if(j<A[i-1]){
                    dp[i][j] = dp[i-1][j];
                }else{
                    dp[i][j] = Math.min(dp[i-1][j],1+dp[i-1][j-A[i-1]]);
                }
            }
        }

        while(dp[n][sum]==9999999){
            sum-=1;
        }
        return dp[n][sum];
    }

}
