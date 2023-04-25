package src.maths.gcd;

public class EnumeratingGCD {

    public String solve(String A, String B) {
        // The GCD of two numbers is 1 only
        // GCD(A,B) => X, (A + nX = B => A + 1)
        // nX = 1 => n and X can't be in 1/n or 1/X i.e. they need to be Natural numbers
        // i.e n = 1 and X = 1;
        return A.equals(B) ? A : "1";
    }

}
