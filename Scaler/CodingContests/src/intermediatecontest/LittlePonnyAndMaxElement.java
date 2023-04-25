package src.intermediatecontest;

import java.util.ArrayList;
import java.util.Collections;

public class LittlePonnyAndMaxElement {

    public int solve(ArrayList<Integer> A, int B) {
        Collections.sort(A);
        int count = 0;
        for(int i=A.size()-1; i>=0; i--) {
            if(A.get(i) == B) return count;
            count++;
        }
        return -1;
    }

}
