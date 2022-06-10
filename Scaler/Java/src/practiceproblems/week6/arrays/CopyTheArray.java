package practiceproblems.week6.arrays;

import java.util.ArrayList;
import java.util.List;

public class CopyTheArray {

    public ArrayList<Integer> solve(final List<Integer> A, int B) {
        ArrayList<Integer> outArr = new ArrayList<>();
        for(Integer val: A) {
            outArr.add(val + B);
        }
        return outArr;
    }

}
