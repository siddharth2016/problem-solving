package practiceproblems.week7;

import java.util.ArrayList;

public class SecondLargest {

    public int solve(ArrayList<Integer> A) {
        if(A.size() == 1) return -1;
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(Integer val : A) {
            if(val > first) {
                second = first;
                first = val;
            }
            else if(val > second) {
                second = val;
            }
        }
        return second;
    }

}
