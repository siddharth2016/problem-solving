package practiceproblems.carryfwd;

import java.util.ArrayList;
import java.util.Collections;

public class LeadersInAnArray {

    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = A.size();
        int leader = A.get(n-1);
        result.add(leader);
        for(int i=n-2; i>-1; i--) {
            if(A.get(i) > leader) {
                leader = A.get(i);
                result.add(leader);
            }
        }
        Collections.reverse(result);
        return result;
    }

}
