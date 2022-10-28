package src.recursion;

public class KthSymbol {

    public int solve(int A, int B) {
        if(A == 1) return 0;

        int mid = (1<<(A-1)) / 2;

        if(B <= mid) return solve(A - 1, B);
        else return 1 - solve(A - 1, B - mid);
    }

}
