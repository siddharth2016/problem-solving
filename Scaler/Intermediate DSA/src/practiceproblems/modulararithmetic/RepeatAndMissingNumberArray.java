package practiceproblems.modulararithmetic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepeatAndMissingNumberArray {

    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        Map<Integer, Integer> map = new HashMap<>();
        for(Integer elem:A) {
            map.put(elem, map.getOrDefault(elem, 0) + 1);
        }
        int missing = 0;
        int repeating = 0;
        for(int i=1; i<=A.size(); i++) {
            if(map.getOrDefault(i, 0) == 0) missing = i;
            else if(map.get(i) == 2) repeating = i;
        }
        ArrayList<Integer> result = new ArrayList<>();
        result.add(repeating);
        result.add(missing);
        return result;
    }

}
