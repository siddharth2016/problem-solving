package practiceproblems.bitmanipulations;

public class ReverseBits {

    public long reverse(long a) {
        long newNumber = 0;
        long power = 1<<31;
        while(a > 0) {
            newNumber += ((a&1) * power);
            power = power>>1;
            a = a>>1;
        }
        return Math.abs(newNumber);
    }

}
