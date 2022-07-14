package practiceproblems.interviewprobs;

import java.util.ArrayList;

public class ChristmasTrees {

    public int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        int n = A.size();
        int result = Integer.MAX_VALUE;
        for(int j=1; j<n-1; j++) {
            int tempSum = B.get(j);
            int Bi = Integer.MAX_VALUE;
            int Bk = Integer.MAX_VALUE;
            for(int i=j-1; i>=0; i--) {
                if(A.get(i) < A.get(j) && B.get(i) < Bi) Bi = B.get(i);
            }
            for(int k=j+1; k<n; k++) {
                if(A.get(j) < A.get(k) && B.get(k) < Bk) Bk = B.get(k);
            }
            if(Bi!=Integer.MAX_VALUE && Bk!=Integer.MAX_VALUE) {
                tempSum += Bi + Bk;
                result = Math.min(result, tempSum);
            }
        }
        if(result == Integer.MAX_VALUE) result = -1;
        return result;
    }

}
