package practiceproblems.prefixsum;

import java.util.ArrayList;

public class TimeToEquality {

    public int solve(ArrayList<Integer> A) {
        int maxElem = Integer.MIN_VALUE;
        for(int val:A) {
            if(val > maxElem) maxElem = val;
        }
        int count = 0;
        for(int val:A) {
            count += maxElem - val;
        }
        return count;
    }

}
