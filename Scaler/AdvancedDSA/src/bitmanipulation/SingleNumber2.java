package src.bitmanipulation;

public class SingleNumber2 {

    public int singleNumber(final int[] A) {
        int[] setBitsCount = new int[32];

        for(int elem: A) {
            int bit = 0;
            while(elem > 0) {
                int isSet = elem & 1;
                setBitsCount[bit] += isSet;
                bit++;
                elem = elem>>1;
            }
        }

        int ans = 0;
        int pow = 1;
        for(int elem: setBitsCount) {
            ans += (elem%3) * pow;
            pow = pow<<1;
        }

        return ans;
    }

}
