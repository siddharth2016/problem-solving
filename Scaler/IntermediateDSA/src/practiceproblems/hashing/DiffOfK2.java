package practiceproblems.hashing;

import java.util.HashSet;
import java.util.List;

public class DiffOfK2 {

    public int diffPossible(final List<Integer> A, int B) {
        HashSet<Integer> hs = new HashSet<>();
        for(int elem: A) {
            if(hs.contains(B + elem) || hs.contains(elem - B)) return 1;
            hs.add(elem);
        }
        return 0;
    }

}
