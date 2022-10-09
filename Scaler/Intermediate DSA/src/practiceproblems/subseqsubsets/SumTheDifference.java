package practiceproblems.subseqsubsets;

import java.util.ArrayList;
import java.util.Collections;

public class SumTheDifference {

    public long powOf2(int i, long mod) {
        if(i == 1) return 2L;
        long result = powOf2(i/2, mod)%mod;
        result = (result%mod * result%mod)%mod;
        if(i%2 == 1) result = (result%mod * 2)%mod;
        return result;
    }

    public int solve(ArrayList<Integer> A) {
        int n = A.size();
        Collections.sort(A);
        long largest = 0;
        long smallest = 0;
        long mod = (long)Math.pow(10, 9) + 7;
        for(int i=n-1; i>=1; i--) {
            long times = powOf2(i, mod) - 1;
            largest = (largest%mod + ((long)A.get(i) * times%mod)%mod)%mod;
        }
        for(int i=0; i<n-1; i++) {
            long times = powOf2(n-1-i, mod) - 1;
            smallest = (smallest%mod + ((long)A.get(i) * times%mod)%mod)%mod;
        }
        return (int)((largest%mod - smallest%mod + mod)%mod);
    }

}
