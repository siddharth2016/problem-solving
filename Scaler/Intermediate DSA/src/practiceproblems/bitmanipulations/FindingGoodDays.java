package practiceproblems.bitmanipulations;

public class FindingGoodDays {

    public int solve(int A) {
        int result = 0;
        while(A > 0) {
            result += (A&1);
            A >>= 1;
        }
        return result;
    }

}
