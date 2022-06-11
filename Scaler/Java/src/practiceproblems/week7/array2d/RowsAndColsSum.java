package practiceproblems.week7.array2d;

import java.util.ArrayList;

public class RowsAndColsSum {

    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        int rows = A.size();
        int cols = A.get(0).size();
        int[] result = new int[rows+cols];
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                result[i] += A.get(i).get(j);
                result[rows+j] += A.get(i).get(j);
            }
        }
        ArrayList<Integer> sumArr = new ArrayList<>();
        for(int i=0; i<rows+cols; i++) {
            sumArr.add(result[i]);
        }
        return sumArr;
    }

}
