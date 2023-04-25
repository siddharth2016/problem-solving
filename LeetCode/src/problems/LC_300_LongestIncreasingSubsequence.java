package src.problems;

import java.util.Arrays;

public class LC_300_LongestIncreasingSubsequence {

    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        int ans = 1;
        for(int i=1; i<nums.length; i++) {
            for(int j=0; j<i; j++) {
                if(nums[i] > nums[j]) {
                    dp[i] = Integer.max(dp[i], dp[j]+1);
                }
            }
            ans = Integer.max(ans, dp[i]);
        }
        return ans;
    }

}
