package src.maths;

import java.util.HashMap;

public class PairSumDivisibleByM {

    public int solve(int[] A, int B) {
        for(int i=0; i<A.length; i++) {
            A[i] = A[i] % B;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int elem: A) {
            int val = B - elem;
            if(elem == 0) count = (count % 1000000007 + map.getOrDefault(elem, 0) % 1000000007) % 1000000007;
            else if(map.containsKey(val)) count = (count % 1000000007 + map.get(val) % 1000000007) % 1000000007;
            map.put(elem, map.getOrDefault(elem, 0) + 1);
        }

        return count;
    }

}
