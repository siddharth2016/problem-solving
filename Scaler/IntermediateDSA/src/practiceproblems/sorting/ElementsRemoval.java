package practiceproblems.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class ElementsRemoval {

    public int solve(ArrayList<Integer> A) {
        int len = A.size();
        int sum = 0;
        Collections.sort(A);
        Collections.reverse(A);
        for(int i=0; i<len; i++) {
            sum += A.get(i) * (i+1);
        }
        return sum;
    }

}
