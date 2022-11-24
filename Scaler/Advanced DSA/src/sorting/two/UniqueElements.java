package src.sorting.two;

import java.util.Arrays;

public class UniqueElements {

    public int solve(int[] A) {
        Arrays.sort(A);
        int count = 0;
        for(int i=1; i<A.length; i++) {
            if(A[i] <= A[i-1]) {
                count += A[i-1] - A[i] + 1;
                A[i] += A[i-1] - A[i] + 1;
            }
        }
        return count;
    }

}
