package practiceproblems.matrices;

import java.util.ArrayList;

public class RotateMatrix {

    private void transposeOf(ArrayList<ArrayList<Integer>> mat) {
        int n = mat.size();
        for(int i=0; i<n; i++) {
            for(int j=0; j<i; j++) {
                int temp = mat.get(i).get(j);
                mat.get(i).set(j, mat.get(j).get(i));
                mat.get(j).set(i, temp);
            }
        }
    }

    private void reverseRowsOf(ArrayList<ArrayList<Integer>> mat) {
        int n = mat.size();
        for(int i=0; i<n; i++) {
            for(int j=0; j<n/2; j++) {
                int temp = mat.get(i).get(j);
                mat.get(i).set(j, mat.get(i).get(n-j-1));
                mat.get(i).set(n-j-1, temp);
            }
        }
    }

    public void solve(ArrayList<ArrayList<Integer>> A) {
        transposeOf(A);
        reverseRowsOf(A);
    }

}
