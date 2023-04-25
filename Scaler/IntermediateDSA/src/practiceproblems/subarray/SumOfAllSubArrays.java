package practiceproblems.subarray;

import java.util.ArrayList;

public class SumOfAllSubArrays {

    public Long subarraySum(ArrayList<Integer> A) {
        int n = A.size();
        long prefixSum = A.get(0);
        long totalSum = A.get(0);
        for(int i=1; i<n; i++) {
            prefixSum += A.get(i);
            totalSum += prefixSum;
        }
        long currentSum = totalSum;
        for(int i=0; i<n; i++) {
            currentSum -= (A.get(i) * (n-i));
            totalSum += currentSum;
        }
        return totalSum;
    }

}
