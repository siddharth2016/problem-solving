package practiceproblems.hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class DistinctNumbersInWindow {

    public ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
        ArrayList<Integer> result = new ArrayList<>();
        if(B > A.size()) return result;

        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<B; i++) {
            hm.put(A.get(i), hm.getOrDefault(A.get(i), 0) + 1);
        }
        result.add(hm.size());

        for(int i=1, j=B; j<A.size(); i++, j++) {
            hm.put(A.get(j), hm.getOrDefault(A.get(j), 0) + 1);
            hm.put(A.get(i-1), hm.get(A.get(i-1)) - 1);
            if(hm.get(A.get(i-1)) == 0) hm.remove(A.get(i-1));
            result.add(hm.size());
        }

        return result;
    }

}
