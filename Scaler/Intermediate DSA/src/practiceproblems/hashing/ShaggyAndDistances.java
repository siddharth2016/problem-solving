package practiceproblems.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ShaggyAndDistances {

    public int solve(ArrayList<Integer> A) {
        Map<Integer, Integer> map = new HashMap<>();
        int minDistance = Integer.MAX_VALUE;
        for(int i=0; i<A.size(); i++) {
            int val = A.get(i);
            if(map.getOrDefault(val, -1) == -1) {
                map.put(val, i);
            }
            else {
                int currMin = i - map.get(val);
                minDistance = Integer.min(minDistance, currMin);
                map.put(val, i);
            }
        }
        if(minDistance == Integer.MAX_VALUE) minDistance = -1;
        return minDistance;
    }

}
