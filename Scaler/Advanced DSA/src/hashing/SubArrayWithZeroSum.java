package src.hashing;

import java.util.HashSet;

public class SubArrayWithZeroSum {

    public long[] createPrefixSum(int[] arr) {
        long[] result = new long[arr.length];
        result[0] = arr[0];
        for(int i=1; i<arr.length; i++) {
            result[i] = result[i-1] + arr[i];
        }
        return result;
    }
    public int solve(int[] A) {
        long[] prefix = createPrefixSum(A);
        HashSet<Long> set = new HashSet<>();
        for(long val: prefix) {
            if(val == 0 || set.contains(val)) return 1;
            set.add(val);
        }
        return 0;
    }

}
