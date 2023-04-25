package src.maths.gcd;

public class DeleteOne {

    public int getGCD(int a, int b) {
        if(a == 0) return b;
        else return getGCD(b % a, a);
    }

    public int[] createPrefix(int[] A) {
        int[] result = new int[A.length];
        result[0] = A[0];
        for(int i=1; i<A.length; i++) {
            result[i] = getGCD(A[i], result[i-1]);
        }
        return result;
    }

    public int[] createSuffix(int[] A) {
        int[] result = new int[A.length];
        result[A.length - 1] = A[A.length - 1];
        for(int i=A.length-2; i>=0; i--) {
            result[i] = getGCD(A[i], result[i+1]);
        }
        return result;
    }

    public int solve(int[] A) {
        int[] prefixGCD = createPrefix(A);
        int[] suffixGCD = createSuffix(A);
        int maxGCD = Integer.MIN_VALUE;
        int left, right, currGCD;
        for(int i=0; i<A.length; i++) {
            if(i == 0) left = 0;
            else left = prefixGCD[i-1];

            if(i == A.length - 1) right = 0;
            else right = suffixGCD[i+1];

            currGCD = getGCD(left, right);
            maxGCD = Integer.max(maxGCD, currGCD);
        }
        return maxGCD;
    }

}
