package src.topinterview150;

public class LC_209_MinimumSizeSubarraySum {

    public int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        int end = 0;
        int ans = Integer.MAX_VALUE;
        int sum = nums[end];
        while(start <= end && end < nums.length) {
            if(sum >= target) {
                ans = Integer.min(ans, end - start + 1);
                sum -= nums[start];
                start++;
            }
            if(sum < target) {
                end++;
                if(end < nums.length) sum += nums[end];
            }
        }
        return ans == Integer.MAX_VALUE? 0: ans;
    }

}
