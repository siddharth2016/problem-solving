package src.modulararithmetic;

public class PrimeModulo {

    public int solve(int A, int B) {
        if (A == 0)
            return 0;
        // fermats theorem ==>  (A^-1)= A^(B-2) mod B
        return pow(A, B - 2, B);
    }

    public int pow(int A, int B, int C) {
        if (B == 0)
            return 1;
        long halfPower = pow(A, B / 2, C);
        long interimResult = halfPower % C * halfPower % C;
        return ((B % 2 == 0) ? (int)((interimResult) + C) % C : (int)((interimResult * A % C) + C) % C);

    }

}
