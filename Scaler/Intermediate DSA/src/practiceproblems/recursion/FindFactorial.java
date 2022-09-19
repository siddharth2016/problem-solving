package practiceproblems.recursion;

public class FindFactorial {

    public int solve(int A) {
        if(A <= 1) return 1;
        return A * solve(A-1);
    }

}
