package practiceproblems.hashing;

import java.util.ArrayList;

public class SubArrayWithGivenSum {

    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        int starti = 0;
        int endj = 0;
        int sum = 0;
        boolean found = false;
        while(endj < A.size() && starti <= endj) {
            if(sum < B) {
                sum += A.get(endj);
                endj++;
            }
            if(sum > B) {
                sum -= A.get(starti);
                starti++;
            }
            if(sum == B) {
                found = true;
                break;
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        if(!found) {
            result.add(-1);
        }
        else {
            for(int i=starti; i<endj; i++) {
                result.add(A.get(i));
            }
        }
        return result;
    }

}
