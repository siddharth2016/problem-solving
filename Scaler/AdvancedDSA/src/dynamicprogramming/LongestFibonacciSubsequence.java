package src.dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

public class LongestFibonacciSubsequence {
    public int solve(int[] A) {
        int[][] dp = new int[A.length][A.length];
        Map<Integer, Integer> map = new HashMap<>();
        map.put(A[0], 0);
        int ans = 0;
        for(int j=1; j<A.length; j++) {
            for(int k=j+1; k<A.length; k++) {
                if(map.containsKey(A[k] - A[j])) {
                    dp[j][k] = 1 + dp[map.get(A[k] - A[j])][j];
                    ans = Integer.max(ans, dp[j][k] + 2);
                }
            }
            map.put(A[j], j);
        }
        if(ans >= 3) return ans;
        return 0;
    }
}
