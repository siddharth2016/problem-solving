package practiceproblems.matrices;

import java.util.ArrayList;

public class AreMatricesSame {

    public int solve(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {
        int rows = A.size();
        int cols = A.get(0).size();
        int areEqual = 1;
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                if(A.get(i).get(j) != B.get(i).get(j)) {
                    areEqual = 0;
                    break;
                }
            }
        }
        return areEqual;
    }

}
