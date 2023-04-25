package practiceproblems.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TwoSumHashMap {

    public ArrayList<Integer> twoSum(final List<Integer> A, int B) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<A.size(); i++) {
            int val = A.get(i);
            if(hm.containsKey(B - val)) {
                result.add(hm.get(B - val) + 1);
                result.add(i + 1);
                break;
            }
            else if(!hm.containsKey(val)) {
                hm.put(val, i);
            }
        }
        return result;
    }

}
