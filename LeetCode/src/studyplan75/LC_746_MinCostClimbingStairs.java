package src.studyplan75;

public class LC_746_MinCostClimbingStairs {

    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for(int i=2; i<cost.length; i++) {
            dp[i] = Integer.min(dp[i-1], dp[i-2]) + cost[i];
        }
        return Integer.min(dp[cost.length-1], dp[cost.length-2]);
    }

}
