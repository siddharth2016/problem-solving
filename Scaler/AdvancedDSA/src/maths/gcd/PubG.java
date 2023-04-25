package src.maths.gcd;

public class PubG {

    public int getGCD(int a, int b) {
        if(a == 0) return b;
        return getGCD(b % a, a);
    }

    public int solve(int[] A) {
        int ans = A[0];
        for(int i=1; i<A.length; i++) {
            ans = getGCD(ans, A[i]);
        }
        return ans;
    }

}
