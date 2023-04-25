package src.recursion;

import java.util.ArrayList;

public class GrayCode {

    public ArrayList<Integer> grayCode(int A) {

        if(A == 1) {
            ArrayList<Integer> result = new ArrayList<>();
            result.add(0);
            result.add(1);
            return result;
        }

        ArrayList<Integer> temp = grayCode(A-1);

        for(int i=temp.size()-1; i>=0; i--) {
            temp.add(temp.get(i) | (1<<(A-1)));
        }

        return temp;
    }

}
