package src.problems;

import java.util.Arrays;

public class LC_673_NumberOfLongestIncreasingSubseq {

    public static void main(String[] args) {
        System.out.println(findNumberOfLIS(new int[]{1,3,2}));
    }

    public static int findNumberOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int[] count = new int[nums.length];
        Arrays.fill(dp, 1);
        Arrays.fill(count, 1);
        int len = 1;
        for(int i=1; i<nums.length; i++) {
            for(int j=0; j<i; j++) {
                if(nums[i] > nums[j]) {
                    if(dp[i] < dp[j] + 1) {
                        dp[i] = dp[i] + 1;
                        count[i] = count[j];
                    }
                    else if(dp[i] == dp[j] + 1) count[i] += count[j];
                }
            }
            len = Integer.max(len, dp[i]);
        }
        if(len == 1) return nums.length;
        int ans = 0;
        for(int i=nums.length-1; i>=0; i--) {
            if(dp[i] == len) ans += count[i];
        }
        return ans;
    }

}
