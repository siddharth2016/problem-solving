package practiceproblems.hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class SubArrayZeroSum {

    public int solve(ArrayList<Integer> A) {
        HashMap<Long, Integer> map = new HashMap<>();
        long sum = 0;
        map.put(sum, 1);
        for(int elem: A) {
            sum += elem;
            if(map.containsKey(sum)) {
                return 1;
            }
            else {
                map.put(sum, 1);
            }
        }
        return 0;
    }

}
