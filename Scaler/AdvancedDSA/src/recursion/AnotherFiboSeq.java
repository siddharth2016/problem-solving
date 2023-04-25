package src.recursion;

public class AnotherFiboSeq {

    public int solve(int A) {
        if(A <= 1) return 1;
        if(A == 2) return 2;
        return A + solve(A - 1) + solve(A - 2) + solve(A - 3);
    }

}
