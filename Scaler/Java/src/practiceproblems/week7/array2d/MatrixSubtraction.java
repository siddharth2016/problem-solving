package practiceproblems.week7.array2d;

import java.util.ArrayList;

public class MatrixSubtraction {

    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<ArrayList<Integer>> C = new ArrayList<>();
        int n = A.size();
        int m = A.get(0).size();
        for(int i=0; i<n; i++) {
            ArrayList<Integer> crr = new ArrayList<>();
            for(int j=0; j<m; j++) {
                crr.add(A.get(i).get(j) - B.get(i).get(j));
            }
            C.add(crr);
        }
        return C;
    }

}
