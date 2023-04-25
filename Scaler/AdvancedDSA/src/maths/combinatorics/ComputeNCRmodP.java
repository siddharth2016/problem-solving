package src.maths.combinatorics;

public class ComputeNCRmodP {

    public int solve(int A, int B, int C) {
        long numerator = 1l, denominator = 1l;
        B = Math.min(B, A - B);

        for (int i = 0; i < B; i++) {
            denominator = (denominator % C * (i + 1) % C) % C;
            numerator = (numerator % C * (A - i) % C) % C;
        }

        denominator = fastPower(denominator, C - 2, C);

        long res = (numerator % C * denominator % C) % C;
        return (int) res;
    }

    public long fastPower(long A, long B, long C) {
        long res = 1;

        while (B > 0) {
            if ((B & 1) == 1) {
                res = (res % C * A % C) % C;
                B = B - 1;
            }

            A = (A % C * A % C) % C;
            B = B / 2;
        }

        return res;
    }

}
