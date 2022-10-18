package src.bitmanipulation;

public class CountTotalSetBits {

    public int solve(int A) {
        long totalGroupOnes = 0;
        long remainingOnes = 0;
        long ans = 0;
        for(int i=0; i<32; i++) {

            if(A < (1<<i)) break;

            if((A & (1<<i)) != 0) remainingOnes = (A % (1<<i)) + 1;
            else remainingOnes = 0;

            totalGroupOnes = (long) (A / (1L << (i + 1))) * (1<<i);

            ans += remainingOnes + totalGroupOnes;
        }

        return (int)(ans % 1000000007);
    }

}
