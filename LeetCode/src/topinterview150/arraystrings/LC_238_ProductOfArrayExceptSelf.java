package src.topinterview150.arraystrings;

public class LC_238_ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int prev = 1;
        for(int i=0; i<nums.length; i++) {
            prefix[i] = prev * nums[i];
            prev = prefix[i];
        }
        prev = 1;
        for(int i=nums.length-1; i>=0; i--) {
            suffix[i] = prev * nums[i];
            prev = suffix[i];
        }

        int[] result = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            if(i == 0) result[i] = suffix[i+1];
            else if(i == nums.length-1) result[i] = prefix[i-1];
            else result[i] = prefix[i-1] * suffix[i+1];
        }

        return result;
    }

}
