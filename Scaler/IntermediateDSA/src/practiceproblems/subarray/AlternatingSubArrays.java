package practiceproblems.subarray;

import java.util.ArrayList;

public class AlternatingSubArrays {

    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        int n = A.size();
        ArrayList<Integer> result = new ArrayList<>();
        int len = 2*B + 1;
        if(len == 1) {
            for(int i=0; i<n; i++) {
                result.add(i);
            }
        }
        else {
            for(int i=0; i<=n-len; i++) {
                boolean alternating = true;
                for(int j=i+1; j<i+len; j++) {
                    if(A.get(j) != 1 - A.get(j-1)) {
                        alternating = false;
                        break;
                    }
                }
                if(alternating) {
                    result.add((i + i + len - 1) / 2);
                }
            }
        }
        return result;
    }

}
