package src.maths.gcd;

import java.util.ArrayList;

public class LargestCoPrimeDivisor {

    public int getGCD(int a, int b) {
        if(a == 0) return b;
        return getGCD(b % a, a);
    }

    public int[] getFactors(int A) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=1; i * i <= A; i++) {
            if(i * i == A) ans.add(i);
            else if(A % i == 0) {
                ans.add(i);
                ans.add(A / i);
            }
        }
        int[] result = new int[ans.size()];
        for(int i=0; i<ans.size(); i++) {
            result[i] = ans.get(i);
        }

        return result;
    }

    public int cpFact(int A, int B) {
        int[] factors = getFactors(A);
        int ans = 1;
        for(int elem: factors) {
            int gcd = getGCD(elem, B);
            if(gcd == 1 && ans < elem) ans = elem;
        }
        return ans;
    }

}
