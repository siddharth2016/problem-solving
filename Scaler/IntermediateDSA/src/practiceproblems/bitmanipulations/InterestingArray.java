package practiceproblems.bitmanipulations;

import java.util.ArrayList;

public class InterestingArray {

    public String solve(ArrayList<Integer> A) {
        int countOdds = 0;
        for(int elem:A) {
            countOdds += elem%2;
        }
        return (countOdds&1) == 1 ? "No" : "Yes";
    }

}
