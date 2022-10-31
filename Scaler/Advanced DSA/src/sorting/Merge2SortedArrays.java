package src.sorting;

import java.util.ArrayList;
import java.util.List;

public class Merge2SortedArrays {

    public ArrayList<Integer> solve(final List<Integer> A, final List<Integer> B) {
        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(A);
        result.addAll(B);

        for(int i=A.size(); i<result.size(); i++) {
            int j = i-1;
            int temp = result.get(i);
            while(j>=0 && result.get(j) > temp) {
                result.set(j+1, result.get(j));
                j--;
            }
            result.set(j+1, temp);
        }

        return result;
    }

}
