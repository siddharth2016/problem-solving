package practiceproblems.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CommonElements {

    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int elem: A) {
            map.put(elem, map.getOrDefault(elem, 0) + 1);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for(Integer elem: B) {
            if(map.getOrDefault(elem, 0) == 0) continue;
            result.add(elem);
            map.put(elem, map.get(elem) - 1);
        }
        return result;
    }

}
