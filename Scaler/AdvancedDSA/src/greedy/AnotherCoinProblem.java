package src.greedy;

public class AnotherCoinProblem {

    public int solve(int A) {
        int result = 0;
        while(A != 0) {
            result += A % 5;
            A = A / 5;
        }
        return result;
    }

}
