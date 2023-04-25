package practiceproblems.subseqsubsets;

import java.util.ArrayList;
import java.util.Collections;

public class Subsets {

    public ArrayList<Integer> filterOut(ArrayList<Integer> arr, int n) {
        ArrayList<Integer> response = new ArrayList<>();
        int i = arr.size() - 1;
        while(n > 0) {
            if((n&1) == 1) response.add(arr.get(i));
            i--;
            n = n>>1;
        }
        return response;
    }

    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
        Collections.sort(A, Collections.reverseOrder());
        int itr = (int)Math.pow(2, A.size()) - 1;
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for(int i=0; i<=itr; i++) {
            result.add(filterOut(A, i));
        }
        Collections.sort(result, (a, b) -> {
            if(a.isEmpty()) return -1;
            else if(b.isEmpty()) return 1;
            else {
                for(int i=0; i<Integer.min(a.size(), b.size()); i++) {
                    if(a.get(i) == b.get(i)) continue;
                    return Integer.compare(a.get(i), b.get(i));
                }
                return 0;
            }
        });
        return result;
    }

}
