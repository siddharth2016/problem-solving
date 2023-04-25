package src.intermediatecontest;

public class ConstructBinaryNumber {

    public int solve(int A, int B) {
        int result = 0;
        int pow = 1;
        int indx = 0;
        while(indx < B) {
            pow *= 2;
            indx++;
        }
        while(indx < A+B) {
            result += pow;
            pow *= 2;
            indx++;
        }

        return result;
    }

}
