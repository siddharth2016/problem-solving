package src.hashing;

import java.util.HashMap;

public class LargestContinuousSequenceZeroSum {

    public int[] createPrefixSum(int[] A) {
        int[] result = new int[A.length];
        result[0] = A[0];
        for(int i=1; i<A.length; i++) {
            result[i] = result[i-1] + A[i];
        }
        return result;
    }

    public int[] lszero(int[] A) {
        int[] prefixSum = createPrefixSum(A);
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen = Integer.MIN_VALUE;
        int starti = -1;
        int endj = -1;
        for(int i=0; i<prefixSum.length; i++) {
            if(prefixSum[i] == 0) {
                if(i + 1 > maxLen) {
                    starti = 0;
                    endj = i+1;
                    maxLen = i+1;
                }
            }
            else if(map.containsKey(prefixSum[i])) {
                if(i - map.get(prefixSum[i]) > maxLen) {
                    starti = map.get(prefixSum[i])+1;
                    endj = i+1;
                    maxLen = i - map.get(prefixSum[i]);
                }
            }
            else if(!map.containsKey(prefixSum[i])) map.put(prefixSum[i], i);
        }

        int[] ans = new int[endj - starti];
        for(int i=starti; i<endj; i++) {
            ans[i-starti] = A[i];
        }
        return ans;
    }

}
