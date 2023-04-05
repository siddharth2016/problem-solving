package src.backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class Subsets {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(subsets(new int[]{1, 2, 3})));
    }

    public static int[][] subsets(int[] A) {
        Arrays.sort(A);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(new ArrayList<>());
        findSubsets(A, 0, new ArrayList<>(), arr);
        int[][] result = new int[arr.size()][];
        for(int i=0; i<arr.size(); i++) {
            int[] temp = new int[arr.get(i).size()];
            for(int j=0; j<arr.get(i).size(); j++) {
                temp[j] = arr.get(i).get(j);
            }
            result[i] = temp;
        }
        return result;
    }

    public static void findSubsets(int[] A, int i, ArrayList<Integer> temp,
                                                     ArrayList<ArrayList<Integer>> result) {
        if(i == A.length) {
            return;
        }
        temp.add(A[i]);
        result.add(new ArrayList<>(temp));
        findSubsets(A, i+1, temp, result);
        temp.remove(temp.size() - 1);
        findSubsets(A, i+1, temp, result);
    }
}
