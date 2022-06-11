package practiceproblems.week7.array2d;

import java.util.ArrayList;

public class AreMatricesSame {

    public int solve(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {
        int n = A.size();
        int same = 1;
        for(int i=0; i<n; i++) {
            if(!A.get(i).equals(B.get(i))) {
                same = 0;
                break;
            }
        }
        return same;
    }

}
