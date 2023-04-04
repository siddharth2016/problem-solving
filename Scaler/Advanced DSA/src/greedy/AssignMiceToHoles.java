package src.greedy;

import java.util.Arrays;

public class AssignMiceToHoles {

    public int mice(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        int result = 0;
        for(int i=0; i<A.length; i++) {
            result = Integer.max(result, Math.abs(A[i] - B[i]));
        }
        return result;
    }

}
