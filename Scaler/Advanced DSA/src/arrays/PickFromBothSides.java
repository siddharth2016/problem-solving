package src.arrays;

import java.util.ArrayList;

public class PickFromBothSides {

    public int solve(ArrayList<Integer> A, int B) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<B; i++) {
            sum += A.get(i);
        }
        if(B == A.size()) return sum;
        maxSum = Integer.max(maxSum, sum);
        int j = A.size() - 1;
        int i = B-1;
        while(i >= 0) {
            sum -= A.get(i);
            sum += A.get(j);
            maxSum = Integer.max(maxSum, sum);
            j--; i--;
        }
        return maxSum;
    }

}
