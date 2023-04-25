package src.bitmanipulation;

public class ReverseBits {

    public long reverse(long A) {
        int i = 0;
        int j = 32;
        long ans = 0;
        while(j >= 0) {
            if((A & (1L<<i)) != 0) {
                ans |= (long)(1L<<j);
            }
            i++; j--;
        }
        return ans>>1;
    }

}
