package src.topinterview150;

import java.util.Arrays;

public class LC_45_JumpGame2 {

    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        for(int i=0; i<nums.length; i++) {
            int j = i + nums[i];
            if(j >= nums.length) j = nums.length - 1;
            while(j > i && dp[j] == -1) {
                dp[j] = dp[i] + 1;
                j--;
            }
        }
        return dp[nums.length-1];
    }

}
