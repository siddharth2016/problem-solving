package practiceproblems.modulararithmetic;

public class OverlappingRectangles {

    public int solve(int A, int B, int C, int D, int E, int F, int G, int H) {
        if(C<=E || G<=A || H<=B || D<=F) return 0;
        return 1;
    }

}
