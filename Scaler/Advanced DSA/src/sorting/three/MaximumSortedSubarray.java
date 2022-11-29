package src.sorting.three;

import java.util.Arrays;

public class MaximumSortedSubarray {

    public int[] subUnsort(int[] A) {
        int[] B = A.clone();
        Arrays.sort(B);
        int start = -1;
        for(int i=0; i<A.length; i++) {
            if(A[i] != B[i]) {
                start = i;
                break;
            }
        }
        if(start == -1) return new int[]{-1};
        int end = -1;
        for(int i=A.length-1; i>=0; i--) {
            if(A[i] != B[i]) {
                end = i;
                break;
            }
        }
        return new int[]{start, end};
    }

}
