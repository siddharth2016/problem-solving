package src.sorting.one;

import java.util.ArrayList;
import java.util.Collections;

public class ChocolateDistribution {

    public int solve(ArrayList<Integer> A, int B) {
        if(B == 0 || A.size() == 0) return 0;
        Collections.sort(A);
        int min = Integer.MAX_VALUE;
        for(int i=0; i<A.size() - B + 1; i++) {
            min = Integer.min(min, A.get(i+B-1) - A.get(i));
        }
        return min;
    }

}
