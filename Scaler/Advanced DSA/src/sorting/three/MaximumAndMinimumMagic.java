package src.sorting.three;

import java.util.Arrays;

public class MaximumAndMinimumMagic {

    public int[] solve(int[] A) {
        int n = A.length;
        int mod = (int)Math.pow(10, 9) + 7;
        Arrays.sort(A);
        long max = 0;
        long min = 0;
        for(int i=0; i<n/2; i++) {
            max = (max % mod + (long)Math.abs(A[i] - A[n-i-1]) % mod) % mod;
        }
        for(int i=0; i<n; i+=2) {
            min = (min % mod + (long)Math.abs(A[i] - A[i+1]) % mod) % mod;
        }
        return new int[]{(int)max, (int)min};
    }

}
