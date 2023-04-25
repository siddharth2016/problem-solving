package practiceproblems.arrayintro;

import java.util.ArrayList;

public class MultipleLeftRotations {

    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int n = A.size();
        for(int val: B) {
            ArrayList<Integer> temp = new ArrayList<>();
            for(int i=val % n; i<n; i++) {
                temp.add(A.get(i));
            }
            for(int i=0; i<val % n; i++) {
                temp.add(A.get(i));
            }
            result.add(temp);
        }
        return result;
    }

}
