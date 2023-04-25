package practiceproblems.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class NobelInteger {

    public int solve(ArrayList<Integer> A) {
        int len = A.size();
        Collections.sort(A);
        Collections.reverse(A);

        int greaterThan = 0;
        for(int i=0; i<len; i++) {
            if(i==0 || A.get(i) != A.get(i-1)) {
                greaterThan = i;
            }
            if(greaterThan == A.get(i)) return 1;
        }

        return -1;
    }

}
