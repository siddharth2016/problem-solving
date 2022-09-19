package practiceproblems.recursion;

public class SumOfDigits {

    public int solve(int A) {
        if(A == 0) return 0;
        return A % 10 + solve(A / 10);
    }

}
