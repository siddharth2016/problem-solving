package src.backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class CombinationSum2 {

    ArrayList<ArrayList<Integer>> result;
    HashSet<String> set;
    public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B) {
        Collections.sort(A);
        result = new ArrayList<>();
        set = new HashSet<>();
        findSubsets(A, 0, B, new ArrayList<>());
        return result;
    }

    public void findSubsets(ArrayList<Integer> arr, int index, int sum, ArrayList<Integer> temp) {
        if(sum < 0) return;
        if(sum == 0) {
            if(!set.contains(temp.toString())) {
                result.add(new ArrayList<>(temp));
                set.add(temp.toString());
            }
            return;
        }
        if(index == arr.size()) return;
        temp.add(arr.get(index));
        findSubsets(arr, index+1, sum - arr.get(index), temp);
        temp.remove(temp.size() - 1);
        findSubsets(arr, index+1, sum, temp);
    }

}
