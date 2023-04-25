package src.hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class SortArrayInGivenOrder {

    public int[] solve(int[] A, int[] B) {
        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer, Integer> seta = new HashMap<>();
        for(int val: A){
            seta.put(val, seta.getOrDefault(val, 0) + 1);
        }
        for(int val: B) {
            set.add(val);
        }
        Arrays.sort(A);
        int[] result = new int[A.length];
        int i = 0;
        for (int k : B) {
            if (seta.containsKey(k)) {
                while (seta.get(k) != 0) {
                    result[i] = k;
                    i++;
                    seta.put(k, seta.get(k) - 1);
                }
            }
        }
        for (int k : A) {
            if (!set.contains(k)) {
                result[i] = k;
                i++;
            }
        }
        return result;
    }

}
