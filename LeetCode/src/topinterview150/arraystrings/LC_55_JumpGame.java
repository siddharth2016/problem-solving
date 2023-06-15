package src.topinterview150.arraystrings;

import java.util.Arrays;

public class LC_55_JumpGame {

    public boolean canJump(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        dp[0] = 1;
        for(int i=0; i<nums.length; i++) {
            if(dp[i] == -1) break;
            int j = i + nums[i];
            if(j >= nums.length) return true;
            while(j >= i && dp[j] == -1) {
                dp[j] = 1;
                j--;
            }
        }
        return dp[nums.length-1] == 1;
    }

}
