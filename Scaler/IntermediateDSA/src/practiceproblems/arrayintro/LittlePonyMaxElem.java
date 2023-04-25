package practiceproblems.arrayintro;

import java.util.ArrayList;

public class LittlePonyMaxElem {

    public int solve(ArrayList<Integer> A, int B) {
        boolean found = false;
        for(int val: A) {
            if(val == B) {
                found = true;
                break;
            }
        }
        if(!found) return -1;
        int count = 0;
        for(int val: A) {
            if(val > B) count++;
        }
        return count;
    }

}
