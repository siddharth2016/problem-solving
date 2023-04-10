package src.backtracking;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SquarefulArrays {

    int count;
    Set<String> set;
    public int solve(int[] A) {
        count = 0;
        set = new HashSet<>();
        if(A.length > 1) squarefulPermutations(A, 0);
        return count;
    }

    public void squarefulPermutations(int[] arr, int index) {
        if(index == arr.length) {
            if(!set.contains(Arrays.toString(arr))) {
                count++;
            }
            set.add(Arrays.toString(arr));
            return;
        }
        for(int j=index; j<arr.length; j++) {
            if(j != index && arr[j] == arr[index]) continue;
            swap(arr, index, j);
            if(index == 0 || isSquare(arr[index] + arr[index-1])) {
                squarefulPermutations(arr, index+1);
            }
            swap(arr, index, j);
        }
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public boolean isSquare(int val) {
        int sqrt = (int)Math.sqrt(val);
        return sqrt * sqrt == val;
    }

}
