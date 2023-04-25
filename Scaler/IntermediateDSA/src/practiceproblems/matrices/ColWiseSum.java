package practiceproblems.matrices;

import java.util.ArrayList;

public class ColWiseSum {

    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        int rows = A.size();
        int cols = A.get(0).size();
        ArrayList<Integer> colWiseSumVec = new ArrayList<>();
        for(int j=0; j<cols; j++) {
            int colSum = 0;
            for(int i=0; i<rows; i++) {
                colSum += A.get(i).get(j);
            }
            colWiseSumVec.add(colSum);
        }
        return colWiseSumVec;
    }

}
