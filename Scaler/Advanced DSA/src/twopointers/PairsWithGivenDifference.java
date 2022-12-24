package src.twopointers;

import java.util.Arrays;

public class PairsWithGivenDifference {

    public int solve(int[] A, int B) {
        Arrays.sort(A);
        int count = 0;
        int i = 0;
        int j = 1;
        while(j < A.length) {
            int val = Math.abs(A[j] - A[i]);
            if(i>0 && A[i] == A[i-1] && A[j] == A[j-1]) {
                i++;
                j++;
            }
            else if(val == B) {
                count++;
                i++;j++;
            }
            else if(val < B) {
                j++;
            }
            else {
                i++;
                if(i == j) j++;
            }
        }
        return count;
    }

}
