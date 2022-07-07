package practiceproblems.subarray;

import java.util.List;

public class MaxSumContiguousSubArray {

    public int maxSubArray(final List<Integer> A) {
        boolean allNeg = true;
        int maxNeg = Integer.MIN_VALUE;
        for(int val: A) {
            if(val > 0) {
                allNeg = false;
                break;
            }
            if(val > maxNeg) maxNeg = val;
        }
        if(allNeg) return maxNeg;

        int currentSum = 0;
        int largestSum = 0;
        for(int val: A) {
            currentSum += val;
            if(currentSum < 0) currentSum = 0;
            if(largestSum < currentSum) largestSum = currentSum;
        }

        return largestSum;
    }

}
