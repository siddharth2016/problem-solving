package src;

public class LC_724_FindPivotIndex {
    public int[] createPrefixSumArr(int[] arr) {
        int[] result = new int[arr.length];
        for(int i=0; i<arr.length; i++) {
            if(i != 0) {
                result[i] = result[i-1] + arr[i];
            }
            else result[i] = arr[i];
        }
        return result;
    }

    public int pivotIndex(int[] nums) {
        int[] prefixSumArr = createPrefixSumArr(nums);
        int leftSum = 0;
        int rightSum = 0;
        int pivotIndx = -1;
        for(int i=0; i<prefixSumArr.length; i++) {
            if(i != 0) {
                leftSum = prefixSumArr[i-1];
            }
            if(i != prefixSumArr.length - 1) {
                rightSum = prefixSumArr[prefixSumArr.length - 1] - prefixSumArr[i];
            }
            if(i == prefixSumArr.length - 1) {
                rightSum = 0;
            }
            if(leftSum == rightSum) {
                pivotIndx = i;
                break;
            }
        }
        return pivotIndx;
    }
}
