package practiceproblems.hashing;

import java.util.ArrayList;
import java.util.HashSet;

public class PairsWithXOR {

    public int solve(ArrayList<Integer> A, int B) {
        HashSet<Integer> hs = new HashSet<>();
        int count = 0;
        for(int elem: A) {
            if(hs.contains(elem ^ B) && !hs.contains(elem)) count++;
            hs.add(elem);
        }
        return count;
    }

}
