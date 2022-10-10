package src.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstMissingInteger {

    public static void main(String[] args) {
        Integer arr[] = new Integer[] {2, 3, 1, 2};
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(arr));
        System.out.println(firstMissingPositive(A));
    }

    public static int firstMissingPositive(ArrayList<Integer> A) {
        boolean onePresent = false;
        for(int i=0; i<A.size(); i++) {
            int val = A.get(i);
            if(val <= 0 || val > A.size()) A.set(i, 1);
            if(val == 1) onePresent = true;
        }
        if(!onePresent) return 1;

        for(int i=0; i<A.size(); i++) {
            int indx = Math.abs(A.get(i)) - 1;
            if(A.get(indx) > 0) {
                A.set(indx, -1 * A.get(indx));
            }
        }

        System.out.println(A);

        System.out.println();
        int result = 0;
        for (Integer elem : A) {
            System.out.print(elem + ", ");
            if (elem > 0) break;
            result++;
        }
        System.out.println();
        return result+1;
    }

}
