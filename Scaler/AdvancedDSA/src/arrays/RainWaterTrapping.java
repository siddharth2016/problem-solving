package src.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RainWaterTrapping {

    public ArrayList<Integer> solveLeft(List<Integer> A) {
        ArrayList<Integer> result = new ArrayList<>();
        int currMax = A.get(0);
        for(int i=0; i<A.size(); i++) {
            if(currMax < A.get(i)) currMax = A.get(i);
            result.add(currMax);
        }
        return result;
    }

    public ArrayList<Integer> solveRight(List<Integer> A) {
        ArrayList<Integer> result = new ArrayList<>();
        int currMax = A.get(A.size() - 1);
        for(int i=A.size()-1; i>=0; i--) {
            if(currMax < A.get(i)) currMax = A.get(i);
            result.add(currMax);
        }
        Collections.reverse(result);
        return result;
    }

    public int trap(final List<Integer> A) {
        ArrayList<Integer> leftPrefix = solveLeft(A);
        ArrayList<Integer> rightPrefix = solveRight(A);
        int waterCount = 0;
        for(int i=0; i<A.size(); i++) {
            waterCount += Integer.min(leftPrefix.get(i), rightPrefix.get(i)) - A.get(i);
        }
        return waterCount;
    }

}
