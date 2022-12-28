package src.hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class CommonElements {

    public int[] solve(int[] A, int[] B) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        for(int val: A) {
            map1.put(val, map1.getOrDefault(val, 0) + 1);
        }

        for(int val: B) {
            map2.put(val, map2.getOrDefault(val, 0) + 1);
        }

        ArrayList<Integer> temp = new ArrayList<>();
        for(int val: map1.keySet()) {
            int rep = Math.min(map1.get(val), map2.getOrDefault(val, 0));
            if(rep != 0) {
                for(int i=0; i<rep; i++) {
                    temp.add(val);
                }
            }
        }

        int[] result = new int[temp.size()];
        for(int i=0; i<temp.size(); i++) {
            result[i] = temp.get(i);
        }

        return result;
    }

}
