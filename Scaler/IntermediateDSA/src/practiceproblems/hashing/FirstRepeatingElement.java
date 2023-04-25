package practiceproblems.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FirstRepeatingElement {

    public int solve(ArrayList<Integer> A) {
        Map<Integer, Integer> map = new HashMap<>();
        for(Integer elem: A) {
            map.put(elem, map.getOrDefault(elem, 0) + 1);
        }
        for(Integer elem: A) {
            if(map.get(elem) > 1) return elem;
        }
        return -1;
    }

}
