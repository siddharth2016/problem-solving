package src.hashing;

import java.util.HashMap;

public class DistinctNumbersInWindow {

    public int[] dNums(int[] A, int B) {
        int len = A.length;
        if(B > len) return new int[]{};

        int[] result = new int[len - B + 1];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<B; i++) {
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
        }
        result[0] = map.size();

        for(int i=B; i<len; i++) {
            map.put(A[i-B], map.get(A[i-B]) - 1);
            if(map.get(A[i-B]) == 0) map.remove(A[i-B]);
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
            result[i-B+1] = map.size();
        }

        return result;
    }

}
