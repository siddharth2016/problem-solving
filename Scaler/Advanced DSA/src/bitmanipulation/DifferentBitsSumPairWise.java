package src.bitmanipulation;

public class DifferentBitsSumPairWise {


    public static void main(String[] args) {
        int[] arr = {1, 3, 5};
        System.out.println(cntBits(arr));
    }

    public static int cntBits(int[] A) {
        long[][] bits = new long[32][2];

        for(int i=0; i<32; i++) {
            for(int elem: A) {
                bits[i][0] += 1 - ((elem>>i) & 1);
                bits[i][1] += (elem>>i) & 1;
            }
        }

        long result = 0;
        long mod = (long)Math.pow(10, 9) + 7;
        for(int i=0; i<32; i++) {
            result = (result + (bits[i][0] * bits[i][1]) % mod) % mod;
        }

        result = (result * 2) % mod;

        return (int)result;
    }

}
