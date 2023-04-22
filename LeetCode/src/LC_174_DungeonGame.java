package src;

import java.util.Arrays;

public class LC_174_DungeonGame {

    //Top Down
    int[][] dp;
    public int calculateMinimumHP(int[][] dungeon) {
        dp = new int[dungeon.length][dungeon[0].length];
        for(int[] arr: dp) {
            Arrays.fill(arr, -1);
        }
        return topDownSolve(dungeon, 0, 0, dp);
    }

    public int topDownSolve(int[][] arr, int i, int j, int[][] dp) {
        if(i == arr.length-1 && j == arr[0].length-1) {
            return Integer.max(1, 1 - arr[i][j]);
        }
        if(i >= arr.length || j >= arr[0].length) return Integer.MAX_VALUE;
        if(dp[i][j] != -1) return dp[i][j];

        int rightWay = topDownSolve(arr, i, j+1, dp);
        int downWay = topDownSolve(arr, i+1, j, dp);

        dp[i][j] = Integer.max(1, Integer.min(rightWay, downWay) - arr[i][j]);
        return dp[i][j];
    }

    // Bottom Up
    public int calculateMinimumHPBottomUP(int[][] dungeon) {
        int rows = dungeon.length;
        int cols = dungeon[0].length;
        int[][] dp = new int[rows][cols];
        for(int i=rows-1; i>=0; i--) {
            for(int j=cols-1; j>=0; j--) {
                if(i == rows - 1 && j == cols - 1) {
                    dp[i][j] = Integer.max(1, 1-dungeon[i][j]);
                }
                else if(i == rows - 1) {
                    dp[i][j] = Integer.max(1, dp[i][j+1] - dungeon[i][j]);
                }
                else if(j == cols - 1) {
                    dp[i][j] = Integer.max(1, dp[i+1][j] - dungeon[i][j]);
                }
                else {
                    dp[i][j] = Integer.max(1, Integer.min(dp[i][j+1], dp[i+1][j]) - dungeon[i][j]);
                }
            }
        }
        return dp[0][0];
    }

}
