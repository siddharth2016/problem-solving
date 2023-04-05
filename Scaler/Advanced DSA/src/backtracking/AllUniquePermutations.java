package src.backtracking;

import java.util.ArrayList;
import java.util.HashSet;

public class AllUniquePermutations {

    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        HashSet<String> hs = new HashSet<>();
        permutations(A, 0, result, hs);
        return result;
    }

    public void permutations(ArrayList<Integer> arr, int index, ArrayList<ArrayList<Integer>> result, HashSet<String> hs) {
        if(index == arr.size()) {
            if(!hs.contains(arr.toString())) {
                result.add(new ArrayList<>(arr));
                hs.add(arr.toString());
            }
            return;
        }
        for(int j=index; j<arr.size(); j++) {
            int temp = arr.get(j);
            arr.set(j, arr.get(index));
            arr.set(index, temp);
            permutations(arr, index+1, result, hs);
            temp = arr.get(j);
            arr.set(j, arr.get(index));
            arr.set(index, temp);
        }
    }

}
