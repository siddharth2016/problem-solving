package practiceproblems.recursion;

public class PowerABC {

    public int pow(int A, int B, int C) {
        if(A==0) return 0;
        if(B==0) return 1;

        long ans = pow(A, B/2, C);
        ans = (ans%C * ans%C)%C;
        if(B%2 == 1) {
            ans = (ans%C * A%C)%C;
        }
        if(ans < 0) return (int)(ans + C)%C;
        return (int)ans;
    }

}
