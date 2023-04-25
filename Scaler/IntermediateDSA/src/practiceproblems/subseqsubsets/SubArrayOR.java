package practiceproblems.subseqsubsets;

import java.util.ArrayList;

public class SubArrayOR {

    public long countSubArrWithORZero(ArrayList<Integer> arr, int i) {
        long count = 0;
        long ans = 0;
        for(Integer elem: arr) {
            if(((elem>>i) & 1) == 0) count++;
            else {
                ans = ans + (count * (count + 1) / 2);
                count = 0;
            }
        }
        ans = ans + (count * (count + 1) / 2);
        return ans;
    }

    public int solve(ArrayList<Integer> A) {
        long mod = (long)Math.pow(10, 9) + 7;
        long n = (long)A.size();
        long ans = 0;
        long totalSubArrays = (n * (n+1))/2;
        for(int i=0; i<32; i++) {
            long zeroSubArrays = countSubArrWithORZero(A, i);
            long ones = totalSubArrays - zeroSubArrays;
            long times = (long)Math.pow(2, i);
            ans = (ans % mod + ((long)ones % mod * times % mod) % mod) % mod;
        }
        return (int)ans;
    }

}
