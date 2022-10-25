package src.maths.gcd;

public class GreatestCommonDivisor {

    public int gcd(int A, int B) {
        if(A == 0) return B;
        else return gcd(B % A, A);
    }

}
