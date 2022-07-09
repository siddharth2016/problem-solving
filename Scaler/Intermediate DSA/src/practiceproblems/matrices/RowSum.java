package practiceproblems.matrices;

import java.util.ArrayList;

public class RowSum {

    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        int rows = A.size();
        int cols = A.get(0).size();
        ArrayList<Integer> rowWiseSum = new ArrayList<>();
        for(int i=0; i<rows; i++) {
            int tempSum = 0;
            for(int j=0; j<cols; j++) {
                tempSum += A.get(i).get(j);
            }
            rowWiseSum.add(tempSum);
        }
        return rowWiseSum;
    }

}
