package src.arrays;

import java.util.List;

public class MaxSumContiguousSubarray {

    public int maxSubArray(final List<Integer> A) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(Integer elem: A) {
            currSum += elem;
            maxSum = Integer.max(maxSum, currSum);
            if(currSum < 0) currSum = 0;
        }
        return maxSum;
    }

}
