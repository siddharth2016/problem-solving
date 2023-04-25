package src.backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Subsets2 {

    ArrayList<ArrayList<Integer>> result;
    Set<String> set;
    public ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> A) {
        Collections.sort(A);
        result = new ArrayList<>();
        result.add(new ArrayList<>());
        set = new HashSet<>();
        allSubsets(A, 0, new ArrayList<>());
        return result;
    }
    public void allSubsets(ArrayList<Integer> arr, int index, ArrayList<Integer> temp) {
        if(index == arr.size()){
            return;
        }
        temp.add(arr.get(index));
        if(!set.contains(temp.toString())) {
            result.add(new ArrayList<>(temp));
        }
        set.add(temp.toString());
        allSubsets(arr, index+1, temp);
        temp.remove(temp.size() - 1);
        allSubsets(arr, index+1, temp);
    }
}
