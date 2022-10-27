package src.recursion;

public class PowerFunction {

    public int pow(int A, int B, int C) {
        if(A == 0) return 0;
        if(B == 0) return 1;
        long power = (long)pow(A, B / 2, C) % C;

        if(B % 2 == 0) return (int)(power % C * power % C) % C;
        return (int)((power % C * power % C * A % C) + C) % C;
    }

}
