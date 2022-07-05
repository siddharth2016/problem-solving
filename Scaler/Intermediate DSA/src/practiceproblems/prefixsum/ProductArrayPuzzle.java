package practiceproblems.prefixsum;

import java.util.ArrayList;

public class ProductArrayPuzzle {

    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int product = 1;
        for(int val:A) {
            product *= val;
        }
        ArrayList<Integer> result = new ArrayList<>();
        for(int val:A) {
            result.add(product / val);
        }
        return result;
    }

}
