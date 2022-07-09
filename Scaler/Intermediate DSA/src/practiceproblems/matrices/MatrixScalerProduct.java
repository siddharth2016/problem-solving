package practiceproblems.matrices;

import java.util.ArrayList;

public class MatrixScalerProduct {

    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, int B) {
        for(int i=0; i<A.size(); i++) {
            for(int j=0; j<A.get(0).size(); j++) {
                A.get(i).set(j, A.get(i).get(j) * B);
            }
        }
        return A;
    }

}
