package src.sorting.one;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayWithConsecutiveElements {
    public int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        for(int i=1; i<A.size(); i++) {
            if(A.get(i-1) + 1 != A.get(i)) return 0;
        }
        return 1;
    }

}
