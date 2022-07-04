package practiceproblems.arrayintro;

import java.util.ArrayList;
import java.util.List;

public class ReverseTheArray {

    public ArrayList<Integer> solve(final List<Integer> A) {
        ArrayList<Integer> reversed = new ArrayList<>();
        for(int i=A.size()-1; i>=0; i--) {
            reversed.add(A.get(i));
        }
        return reversed;
    }

}
