package practiceproblems.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class ArithmeticProgression {

    public int solve(ArrayList<Integer> A) {
        int len = A.size();
        if(len <= 2) return 1;

        Collections.sort(A);
        int diff = A.get(1) - A.get(0);
        for(int i=2; i<len; i++) {
            if((A.get(i) - A.get(i-1)) != diff) return 0;
        }
        return 1;
    }

}
