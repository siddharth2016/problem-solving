package practiceproblems.recursion;

import java.util.ArrayList;
import java.util.Collections;

public class GrayCode {

    public int computeGrayCode(int A) {
        return A ^ (A >> 1);
    }

    public ArrayList<Integer> generateGrayCodes(int A, ArrayList<Integer> arr) {
        if(A < 0) return arr;
        else {
            arr.add(computeGrayCode(A));
            return generateGrayCodes(A-1, arr);
        }
    }

    public ArrayList<Integer> grayCode(int a) {
        ArrayList<Integer> arr = new ArrayList<>();
        Collections.reverse(generateGrayCodes((int)Math.pow(2, a) - 1, arr));
        return arr;
    }

}
