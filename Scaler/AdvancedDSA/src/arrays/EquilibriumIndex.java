package src.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class EquilibriumIndex {

    public static void main(String[] args) {
        Integer a[] = new Integer[] {1, 2, 3, 7, 1, 2, 3};
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(a));
        System.out.println(solve(arr));
    }

    public static int solve(ArrayList<Integer> A) {
        ArrayList<Integer> prefixSum = new ArrayList<>();
        prefixSum.add(A.get(0));
        for(int i=1; i<A.size(); i++) {
            int prev = prefixSum.get(i-1);
            prefixSum.add(prev + A.get(i));
        }
        System.out.println(prefixSum);
        int leftSum = 0;
        int rightSum = 0;
        for(int i=0; i<A.size(); i++) {
            if(i != 0) {
                leftSum = prefixSum.get(i-1);
            }
            rightSum = prefixSum.get(A.size() - 1) - prefixSum.get(i);
            if(leftSum == rightSum) return i;
        }
        return -1;
    }

}
