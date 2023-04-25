package src.hashing;

import java.util.HashMap;

public class ShaggyAndDistances {

    public int solve(int[] A) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int minLen = Integer.MAX_VALUE;
        for(int i=0; i<A.length; i++) {
            if(map.containsKey(A[i])) {
                minLen = Math.min(minLen, i - map.get(A[i]));
            }
            map.put(A[i], i);
        }
        return minLen != Integer.MAX_VALUE ? minLen : -1;
    }

}
