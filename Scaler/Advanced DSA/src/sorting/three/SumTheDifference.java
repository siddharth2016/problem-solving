package src.sorting.three;

import java.util.Arrays;

public class SumTheDifference {

    public int solve(int[] A) {
        Arrays.sort(A);
        int mod = (int)Math.pow(10, 9) + 7;
        long result = 0l;
        for(int i=0; i<A.length; i++) {
            long factor = 1l;
            for(int j=i+1; j<A.length; j++) {
                long diff = ((A[j] % mod - A[i] % mod + mod) % mod * factor % mod) % mod;
                result = (result % mod + diff % mod) % mod;
                factor = (factor % mod * 2) % mod;
            }
        }
        return (int)result;
    }

}
