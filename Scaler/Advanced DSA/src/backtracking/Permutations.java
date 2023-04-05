package src.backtracking;

import java.util.ArrayList;

public class Permutations {

    static int count = 0;

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        System.out.println(permute(arr));
    }

    public static ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        permutations(A, 0, result);
        return result;
    }

    public static void permutations(ArrayList<Integer> arr, int i, ArrayList<ArrayList<Integer>> result) {
        if(i == arr.size()) {
            result.add(new ArrayList<>(arr));
            return;
        }
        for(int j=i; j<arr.size(); j++) {
            int temp = arr.get(j);
            arr.set(j, arr.get(i));
            arr.set(i, temp);
            permutations(arr, i+1, result);
            temp = arr.get(j);
            arr.set(j, arr.get(i));
            arr.set(i, temp);
        }
    }

}
