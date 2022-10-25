package src.modulararithmetic;

public class VeryLargePower {

    public long poW(long A, long B, long c) {
        if(B == 0) return 1;
        long p = poW(A, B/2, c);
        p = (p%c * p%c)%c;
        if(B % 2 == 1) p = (p%c * A%c)%c;
        return p%c;
    }

    public int solve(int A, int B) {
        long mod = (long)Math.pow(10, 9) + 7;
        long power = 1;
        for(int i=1; i<=B; i++) {
            power = (power * (long)i) % (mod-1);
        }
        return (int)poW((long)A, power, mod);
    }

}
