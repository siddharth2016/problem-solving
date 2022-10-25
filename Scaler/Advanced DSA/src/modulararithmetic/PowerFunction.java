package src.modulararithmetic;

public class PowerFunction {

    public int pow(int A, int B, int C) {
        if(A < 0 ) A = C+A;
        if(A == 0) return 0;
        if(B == 0) return 1;
        long p = pow(A , B/2 , C);
        if(B % 2 == 0)
            return (int) (p % C * p % C )%C;
        else
            return (int) ((p*p)%C * A%C)%C;
    }

}
