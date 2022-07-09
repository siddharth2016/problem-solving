package practiceproblems.matrices;

import java.util.ArrayList;

public class MatrixTranspose {

    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        int rows = A.size();
        int cols = A.get(0).size();
        ArrayList<ArrayList<Integer>> transpose = new ArrayList<>();
        for(int j=0; j<cols; j++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for(int i=0; i<rows; i++) {
                temp.add(A.get(i).get(j));
            }
            transpose.add(temp);
        }
        return transpose;
    }

}
