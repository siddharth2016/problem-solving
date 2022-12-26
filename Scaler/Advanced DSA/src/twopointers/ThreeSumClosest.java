package src.twopointers;

import java.util.Arrays;

public class ThreeSumClosest {

    public static void main(String[] args) {
        int val = Integer.MAX_VALUE;
        int someVal = -15;
        int x = 10;
        if(Math.abs(x - someVal) < Math.abs(x - val)) {
            val = someVal;
        }
        System.out.println(val);
    }

    public int threeSumClosest(int[] A, int B) {
        Arrays.sort(A);
        long ans = Integer.MAX_VALUE;
        for(int i=0; i<A.length-2; i++) {
            int j = i+1;
            int k = A.length-1;
            while(j < k) {
                int currSum = A[i] + A[j] + A[k];
                if(Math.abs(B - currSum) < Math.abs(B - ans)) {
                    ans = currSum;
                }
                if(currSum>B) {
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        return (int)ans;
    }

}
