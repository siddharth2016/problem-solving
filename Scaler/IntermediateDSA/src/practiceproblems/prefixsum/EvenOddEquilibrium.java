package practiceproblems.prefixsum;

import java.util.ArrayList;

public class EvenOddEquilibrium {

    public int solve(ArrayList<Integer> A) {
        int n = A.size();
        int[] evenPrefix = new int[n];
        int[] oddPrefix = new int[n];
        evenPrefix[0] = A.get(0);
        oddPrefix[0] = 0;
        for(int i=1; i<n; i++) {
            if(i % 2 == 0) {
                evenPrefix[i] = evenPrefix[i-1] + A.get(i);
                oddPrefix[i] = oddPrefix[i-1];
            }
            else {
                evenPrefix[i] = evenPrefix[i-1];
                oddPrefix[i] = oddPrefix[i-1] + A.get(i);
            }
        }
        int evenSum, oddSum, count=0;
        for(int i=0; i<n; i++) {
            if(i == 0) {
                evenSum = oddPrefix[n-1] - oddPrefix[i];
                oddSum = evenPrefix[n-1] - evenPrefix[i];
            }
            else {
                evenSum = oddPrefix[n-1] - oddPrefix[i] + evenPrefix[i-1];
                oddSum = evenPrefix[n-1] - evenPrefix[i] + oddPrefix[i-1];
            }
            if(evenSum == oddSum) count++;
        }
        return count;
    }

}
