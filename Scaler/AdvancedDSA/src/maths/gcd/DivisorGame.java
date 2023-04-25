package src.maths.gcd;

public class DivisorGame {

    public int getGCD(int a, int b) {
        if(a == 0) return b;
        return getGCD(b % a, a );
    }

    public int solve(int A, int B, int C) {
        int lcm = (B * C) / getGCD(B, C);
        return A / lcm;
    }

}
