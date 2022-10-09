package practiceproblems.subseqsubsets;

import java.util.ArrayList;

public class SubsequenceSum {

    public int subSequenceSum(ArrayList<Integer> arr, int n) {
        int sum = 0;
        int j = arr.size() - 1;
        while(n > 0) {
            if((n&1) == 1) sum += arr.get(j);
            j--;
            n = n>>1;
        }
        return sum;
    }

    public int solve(ArrayList<Integer> A, int B) {
        int itr = (int)Math.pow(2, A.size()) - 1;
        for(int i=0; i<=itr; i++) {
            if(subSequenceSum(A, i) == B) return 1;
        }
        return 0;
    }

}
