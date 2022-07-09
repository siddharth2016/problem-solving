package practiceproblems.matrices;

import java.util.ArrayList;

public class MatrixMultiplication {

    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {
        int arows = A.size();
        int acols = A.get(0).size();
        int brows = B.size();
        int bcols = B.get(0).size();

        ArrayList<ArrayList<Integer>> C = new ArrayList<>();

        for(int i=0; i<arows; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0; j<bcols; j++) {
                int ijSum = 0;
                for(int k=0; k<acols; k++) {
                    ijSum += A.get(i).get(k) * B.get(k).get(j);
                }
                temp.add(ijSum);
            }
            C.add(temp);
        }

        return C;
    }

}
