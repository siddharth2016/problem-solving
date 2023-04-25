package practiceproblems.arrayintro;

import java.util.ArrayList;

public class MinimumPicks {

    public int solve(ArrayList<Integer> A) {
        int maxEven = Integer.MIN_VALUE;
        int minOdd = Integer.MAX_VALUE;
        for(int val: A) {
            if(val % 2 == 0 && val > maxEven) maxEven = val;
            else if(Math.abs(val % 2) == 1 && val < minOdd) minOdd = val;
        }
        return maxEven - minOdd;
    }

}
