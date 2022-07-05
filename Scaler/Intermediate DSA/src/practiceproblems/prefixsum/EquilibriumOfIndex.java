package practiceproblems.prefixsum;

import java.util.ArrayList;

public class EquilibriumOfIndex {

    public int solve(ArrayList<Integer> A) {
        ArrayList<Integer> prefixSums = new ArrayList<>();
        int cumSum = 0;
        for(int val: A) {
            cumSum += val;
            prefixSums.add(cumSum);
        }
        int n = prefixSums.size();
        int leftSum=0, rightSum=0;
        for(int i=0; i<n; i++) {
            if(i != 0) {
                leftSum = prefixSums.get(i-1);
            }
            rightSum = prefixSums.get(n-1) - prefixSums.get(i);
            if(leftSum == rightSum) return i;
        }
        return -1;
    }

}
