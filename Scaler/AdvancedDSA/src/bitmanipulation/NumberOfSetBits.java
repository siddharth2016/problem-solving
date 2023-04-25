package src.bitmanipulation;

public class NumberOfSetBits {

    public int numSetBits(int A) {
        int countSetBits = 0;
        while(A > 0) {
            countSetBits += A&1;
            A = A>>1;
        }
        return countSetBits;
    }

}
