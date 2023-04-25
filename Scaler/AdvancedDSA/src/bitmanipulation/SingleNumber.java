package src.bitmanipulation;

public class SingleNumber {

    public int singleNumber(final int[] A) {
        int result = 0;
        for(int elem: A) {
            result ^= elem;
        }
        return result;
    }

}
