package practiceproblems.interviewprobs;

import java.util.ArrayList;

public class MaximumPositivity {

    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int n = A.size();
        int i=0, len=0, maxLen=0, req_i=0;
        for(int j=0; j<n; j++) {
            int val = A.get(j);
            if(val>=0 && len==0) {
                i = j;
                len++;
            }
            else if(val>=0) len++;

            if(len > maxLen) {
                maxLen = len;
                req_i = i;
            }

            if(val < 0) len = 0;
        }

        ArrayList<Integer> result = new ArrayList<>();
        for(int x=req_i; x<req_i+maxLen; x++) {
            result.add(A.get(x));
        }
        return result;
    }

}
