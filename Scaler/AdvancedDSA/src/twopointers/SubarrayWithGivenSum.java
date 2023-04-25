package src.twopointers;

import java.util.HashMap;

public class SubarrayWithGivenSum {

    public long[] createPrefixSumArray(int[] arr) {
        long[] result = new long[arr.length];
        result[0] = arr[0];
        for(int i=1; i<arr.length; i++) {
            result[i] = result[i-1] + arr[i];
        }
        return result;
    }

    public int[] solve(int[] A, int B) {
        HashMap<Long, Integer> map = new HashMap<>();
        long[] prefixSum = createPrefixSumArray(A);
        int startIndx = -1;
        int endIndx = -1;
        for(int i=0; i<A.length; i++) {
            long val = prefixSum[i] - B;
            if(map.containsKey(val)) {
                startIndx = map.get(val)+1;
                endIndx = i+1;
                break;
            }
            if(val == 0) {
                startIndx = 0;
                endIndx = i+1;
                break;
            }
            map.put(prefixSum[i], i);
        }
        if(startIndx == -1) return new int[]{-1};
        int[] ans = new int[endIndx - startIndx];
        int j=0;
        for(int i=startIndx; i<endIndx; i++) {
            ans[j] = A[i];
            j++;
        }
        return ans;
    }

}
