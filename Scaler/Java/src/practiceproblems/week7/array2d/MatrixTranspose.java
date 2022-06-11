package practiceproblems.week7.array2d;

import java.util.ArrayList;

public class MatrixTranspose {

    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        int rows = A.size();
        int cols = A.get(0).size();
        ArrayList<ArrayList<Integer>> transpose = new ArrayList<>();
        for(int i=0; i<cols; i++) {
            ArrayList<Integer> tr = new ArrayList<>();
            for(int j=0; j<rows; j++) {
                tr.add(A.get(j).get(i));
            }
            transpose.add(tr);
        }
        return transpose;
    }

}
