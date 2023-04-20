package src.dynamicprogramming;

import java.util.ArrayList;

public class MinSumPathInTriangle {
    public int minimumTotal(ArrayList<ArrayList<Integer>> A) {
        int[][] dp = new int[A.size()][A.size()];
        dp[0][0] = A.get(0).get(0);
        int ans = Integer.MAX_VALUE;
        for(int i=1; i<A.size(); i++) {
            for(int j=0; j<=i; j++) {
                if(j==0) dp[i][j] = dp[i-1][j] + A.get(i).get(j);
                else if(j == i) dp[i][j] = dp[i-1][j-1] + A.get(i).get(j);
                else dp[i][j] = Integer.min(dp[i-1][j-1] + A.get(i).get(j), dp[i-1][j] + A.get(i).get(j));
            }
        }
        for(int j=0; j<A.size(); j++) {
            ans = Integer.min(dp[A.size() - 1][j], ans);
        }
        return ans;
    }
}
