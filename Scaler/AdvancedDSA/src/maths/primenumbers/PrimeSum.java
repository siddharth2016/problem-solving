package src.maths.primenumbers;

import java.util.ArrayList;

public class PrimeSum {

    public boolean[] generateSieve(int n) {
        boolean[] result = new boolean[n+1];
        result[0] = result[1] = true;
        for(int i=2; i * i<=n; i++) {
            for(int j=i * i; j<=n; j=j+i) {
                result[j] = true;
            }
        }
        return result;
    }

    public ArrayList<Integer> primesum(int A) {
        boolean[] sieve = generateSieve(A);
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=2; i<sieve.length; i++) {
            int val = A - i;
            if(!sieve[i] && !sieve[val]) {
                result.add(i);
                result.add(val);
                break;
            }
        }

        return result;
    }

}
