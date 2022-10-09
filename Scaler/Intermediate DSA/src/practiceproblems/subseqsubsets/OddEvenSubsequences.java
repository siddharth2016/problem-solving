package practiceproblems.subseqsubsets;

import java.util.ArrayList;

public class OddEvenSubsequences {

    public int seqMaxLength(ArrayList<Integer> arr, int type) {
        int len = 0;
        for(Integer elem: arr) {
            if(elem % 2 == type) {
                len++;
                type = 1 - type;
            }
        }
        return len;
    }

    public int solve(ArrayList<Integer> A) {
        int maxLength = 0;
        if(A.get(0) % 2 == 1) maxLength = Integer.max(maxLength, seqMaxLength(A, 1));
        else maxLength = Integer.max(maxLength, seqMaxLength(A, 0));
        return maxLength;
    }

}
