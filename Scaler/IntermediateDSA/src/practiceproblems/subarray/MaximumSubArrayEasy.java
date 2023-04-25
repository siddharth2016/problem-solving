package practiceproblems.subarray;

import java.util.ArrayList;

public class MaximumSubArrayEasy {

    public int maxSubarray(int A, int B, ArrayList<Integer> C) {
        int[] prefixSum = new int[A];
        prefixSum[0] = C.get(0);
        for(int i=1; i<A; i++) {
            prefixSum[i] = prefixSum[i-1] + C.get(i);
        }
        int result = 0;
        int currentSum = 0;
        for(int i=0; i<A; i++) {
            for(int j=i; j<A; j++) {
                if(i==0) currentSum = prefixSum[j];
                else currentSum = prefixSum[j] - prefixSum[i-1];
                if(result < currentSum && currentSum <= B) {
                    result = currentSum;
                }
            }
        }
        return result;
    }

}
