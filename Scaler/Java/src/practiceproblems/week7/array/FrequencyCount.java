package practiceproblems.week7.array;

import java.util.ArrayList;

public class FrequencyCount {

    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int[] dict = new int[1001];
        for(Integer val : A) {
            dict[val]++;
        }
        ArrayList<Integer> result = new ArrayList<>();
        for(Integer val : A) {
            result.add(dict[val]);
        }
        return result;
    }

}
