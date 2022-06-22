package practiceproblems.week8.strings;

import java.util.ArrayList;

public class SearchAllOccurences {

    public ArrayList<Integer> solve(String A, int B) {
        char b = (char)B;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<A.length(); i++) {
            if(A.charAt(i) == b) arr.add(i);
        }
        return arr;
    }

}
