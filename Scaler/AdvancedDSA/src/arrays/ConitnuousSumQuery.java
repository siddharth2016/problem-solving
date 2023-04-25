package src.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class ConitnuousSumQuery {

    public ArrayList<Integer> solve(int A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<Integer> result = new ArrayList<>(Collections.nCopies(A, 0));
        for(ArrayList<Integer> list: B) {
            int start = list.get(0);
            int end = list.get(1);
            int amount = list.get(2);
            result.set(start-1, result.get(start-1) + amount);
            if(end < A) result.set(end, result.get(end) - amount);
        }

        for(int i=1; i<A; i++) {
            result.set(i, result.get(i-1) + result.get(i));
        }

        return result;
    }

}
