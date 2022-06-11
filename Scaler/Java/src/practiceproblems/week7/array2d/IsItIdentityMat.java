package practiceproblems.week7.array2d;

import java.util.ArrayList;
import java.util.List;

public class IsItIdentityMat {

    public int solve(final List<ArrayList<Integer>> A) {
        int n = A.size();
        int identity = 1;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if((i != j && A.get(i).get(j) == 1) || (i == j && A.get(i).get(j) == 0)) {
                    identity = 0;
                    break;
                }
            }
        }
        return identity;
    }

}
