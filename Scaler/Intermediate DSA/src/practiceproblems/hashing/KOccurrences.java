package practiceproblems.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class KOccurrences {

    public int getSum(int A, int B, ArrayList<Integer> C) {
        int result = 0;
        boolean flag = false;
        Map<Integer, Integer> map = new HashMap<>();
        for(int elem: C) {
            map.put(elem, map.getOrDefault(elem, 0) + 1);
        }
        for(int key: map.keySet()) {
            if(map.get(key) == B) {
                result = (result%1000000007 + key%1000000007) % 1000000007;
                flag = true;
            }
        }
        if(flag) return result;
        return -1;
    }

}
