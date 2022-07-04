package practiceproblems.arrayintro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GoodPair {

    public int solve(ArrayList<Integer> A, int B) {
        int found = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(Integer val: A) {
            if(map.getOrDefault(B - val, 0) != 0) {
                found = 1;
                break;
            }
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        return found;
    }

}
