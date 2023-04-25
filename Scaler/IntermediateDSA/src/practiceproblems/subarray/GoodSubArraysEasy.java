package practiceproblems.subarray;

import java.util.ArrayList;

public class GoodSubArraysEasy {

    public int solve(ArrayList<Integer> A, int B) {
        int n = A.size();
        int[] prefixSum = new int[n];
        prefixSum[0] = A.get(0);
        for(int i=1; i<n; i++) {
            prefixSum[i] = prefixSum[i-1] + A.get(i);
        }
        int count = 0;
        int currentSum = 0;
        for(int i=0; i<n; i++) {
            for(int j=i; j<n; j++) {
                if(i==0) currentSum = prefixSum[j];
                else currentSum = prefixSum[j] - prefixSum[i-1];
                int len = j-i+1;
                if((len % 2 == 0 && currentSum < B) ||
                        (len % 2 == 1 && currentSum > B)) count++;
            }
        }
        return count;
    }

}
