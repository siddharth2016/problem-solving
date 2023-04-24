package src;

public class LC_2653_SlidingSubarrayBeauty {

    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int[] neg = new int[50];
        int[] result = new int[nums.length - k + 1];
        for(int i=0; i<nums.length; i++) {
            if(nums[i] < 0) neg[nums[i] + 50] += 1;
            if(i - k >= 0 && nums[i-k] < 0) neg[nums[i-k] + 50] -= 1;
            if(i - k + 1 < 0) continue;
            int count = 0;
            for(int j=0; j<50; j++) {
                count += neg[j];
                if(count >= x) {
                    result[i-k+1] = j - 50;
                    break;
                }
            }
        }
        return result;
    }

}
