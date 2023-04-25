package practiceproblems.carryfwd;

import java.util.ArrayList;

public class ClosestMinMax {
    public int solve(ArrayList<Integer> A) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int val: A) {
            if(val > max) max = val;
            if(val < min) min = val;
        }
        if(min == max) return 1;
        int n = A.size();
        int minIdx = -1, maxIdx = -1, minLen = Integer.MAX_VALUE;
        for(int i=0; i<n; i++) {
            if(A.get(i) == min) {
                minIdx = i;
            }
            else if(A.get(i) == max) {
                maxIdx = i;
            }
            if(minIdx!=-1 && maxIdx!=-1) {
                minLen = Math.min(minLen, Math.abs(maxIdx - minIdx) + 1);
            }
        }
        return minLen;
    }
}
