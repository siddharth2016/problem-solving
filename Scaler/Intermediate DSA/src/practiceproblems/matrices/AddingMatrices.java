package practiceproblems.matrices;

import java.util.ArrayList;

public class AddingMatrices {

    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {
        int n = A.size();
        int m = A.get(0).size();
        for(int i=0; i<n; i++) {
            ArrayList<Integer> temp = A.get(i);
            for(int j=0; j<m; j++) {
                temp.set(j, temp.get(j) + B.get(i).get(j));
            }
        }
        return A;
    }

}
