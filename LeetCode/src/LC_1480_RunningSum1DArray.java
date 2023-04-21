package src;

public class LC_1480_RunningSum1DArray {

    public int[] runningSum(int[] nums) {
        int[] sumArr = new int[nums.length];
        sumArr[0] = nums[0];
        for(int i=1; i<nums.length; i++) {
            sumArr[i] = sumArr[i-1] + nums[i];
        }
        return sumArr;
    }

}
