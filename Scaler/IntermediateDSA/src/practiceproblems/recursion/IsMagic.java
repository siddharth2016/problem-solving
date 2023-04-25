package practiceproblems.recursion;

public class IsMagic {

    public int digitSum(int A) {
        if(A == 0) return 0;
        else return A % 10 + digitSum(A / 10);
    }

    public int solve(int A) {
        if(A == 1) return 1;
        else if(A >= 0 && A <= 9) return 0;
        else return solve(digitSum(A));
    }

}
