package src.bitmanipulation;

import java.util.Arrays;

public class MinXORPair {

    public int findMinXor(int[] A) {
        Arrays.sort(A);
        int ans = Integer.MAX_VALUE;

        for(int i=1; i<A.length; i++) {
            int xor = A[i-1] ^ A[i];
            ans = Integer.min(ans, xor);
        }
        return ans;
    }


}
