package practiceproblems.modulararithmetic;

public class ConcatenateThreeNumbers {

    public int solve(int A, int B, int C) {
        int max = 0;
        int min = 100;
        int mid = 0;

        if(A>=B && A>=C) max = A;
        else max = Math.max(B, C);

        if(A<=B && A<=C) min = A;
        else min = Math.min(B, C);

        mid = (A+B+C) - (min + max);

        return (min * 100 + mid) * 100 + max;
    }

}
