package practiceproblems.matrices;

import java.util.ArrayList;

public class RowToColZero {

    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        int rows = A.size();
        int cols = A.get(0).size();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        boolean[] arri = new boolean[rows];
        boolean[] arrj = new boolean[cols];
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                if(A.get(i).get(j) == 0) {
                    arri[i] = true;
                    arrj[j] = true;
                }
            }
        }

        for(int i=0; i<rows; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0; j<cols; j++) {
                if(arri[i] || arrj[j]) temp.add(0);
                else temp.add(A.get(i).get(j));
            }
            result.add(temp);
        }

        return result;
    }

}
