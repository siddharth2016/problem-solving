package practiceproblems.matrices;

import java.util.ArrayList;

public class MatrixSubtraction {

    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {
        int n = A.size();
        int m = A.get(0).size();
        ArrayList<ArrayList<Integer>> C = new ArrayList<>();
        for(int i=0; i<n; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0; j<m; j++) {
                temp.add(A.get(i).get(j) - B.get(i).get(j));
            }
            C.add(temp);
        }
        return C;
    }

}
