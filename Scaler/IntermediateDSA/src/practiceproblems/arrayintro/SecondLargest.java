package practiceproblems.arrayintro;

import java.util.ArrayList;

public class SecondLargest {

    public int solve(ArrayList<Integer> A) {
        int first = -1;
        int second = -1;
        for(int val: A) {
            if(val >= first) {
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
