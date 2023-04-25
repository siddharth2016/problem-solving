package practiceproblems.arraysmaths;

public class NthMagicNumber {

    public int solve(int A) {
        int pow = 5;
        int result = 0;
        while(A > 0) {
            result += pow * (A % 2);
            pow *= 5;
            A /= 2;
        }
        return result;
    }

}
