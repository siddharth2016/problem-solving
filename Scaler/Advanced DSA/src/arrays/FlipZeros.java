package src.arrays;

import java.util.ArrayList;

public class FlipZeros {

    public ArrayList<Integer> flip(String A) {
        ArrayList<Integer> result = new ArrayList<>();
        for(Character elem: A.toCharArray()) {
            if(elem == '1') result.add(-1);
            else result.add(1);
        }
        int indx = 0;
        int start = 0;
        int end = -1;
        int maxSum = 0;
        int currSum = 0;
        for(int i=0; i<A.length(); i++) {
            currSum += result.get(i);
            if(currSum < 0) {
                currSum = 0;
                indx = i + 1;
            }
            if(currSum > maxSum) {
                maxSum = currSum;
                start = indx;
                end = i+1;
            }
        }
        result.clear();
        if(end != -1) {
            result.add(start+1);
            result.add(end);
        }
        return result;
    }

}
