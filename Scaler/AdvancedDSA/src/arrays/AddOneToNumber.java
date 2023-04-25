package src.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class AddOneToNumber {

    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        ArrayList<Integer> result = new ArrayList<>();
        int indx=0;
        int length = A.size();
        while(indx < length) {
            if(A.get(indx) != 0) break;
            indx++;
        }
        if(indx == length) {
            result = new ArrayList<>();
            result.add(1);
        }
        else if(A.get(length - 1) != 9) {
            A.set(length-1, A.get(length-1)+1);
            result = new ArrayList<Integer>(A.subList(indx, length));
        }
        else {
            result = new ArrayList<>();
            int carry = 1;
            int i = length-1;
            boolean carryZero = false;
            while(i >= indx) {
                int n = A.get(i) + carry;
                int newDigit = n % 10;
                carry = n / 10;
                result.add(newDigit);
                if(carry == 0) {
                    carryZero = true;
                }
                i--;
            }
            if(!carryZero) result.add(1);
            Collections.reverse(result);
        }
        return result;
    }

}
