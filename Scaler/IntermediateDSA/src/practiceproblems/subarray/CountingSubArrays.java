package practiceproblems.subarray;

import java.util.ArrayList;

public class CountingSubArrays {

    public int solve(ArrayList<Integer> A, int B) {
        int n = A.size();
        int[] prefixSum = new int[n];
        prefixSum[0] = A.get(0);
        for(int i=1; i<n; i++) {
            prefixSum[i] = prefixSum[i-1] + A.get(i);
        }
        int currentSum = 0;
        int count = 0;
        for(int i=0; i<n; i++) {
            for(int j=i; j<n; j++) {
                if(i==0) currentSum = prefixSum[j];
                else currentSum = prefixSum[j] - prefixSum[i-1];
                if(currentSum < B) count++;
            }
        }
        return count;
    }

}
