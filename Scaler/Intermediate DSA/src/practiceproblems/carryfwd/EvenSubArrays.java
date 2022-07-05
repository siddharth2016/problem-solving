package practiceproblems.carryfwd;

import java.util.ArrayList;

public class EvenSubArrays {

    public String solve(ArrayList<Integer> A) {
        if(A.size() % 2 == 1) return "NO";
        if(A.get(0) % 2 == 1 || A.get(A.size()-1) % 2 == 1) return "NO";
        return "YES";
    }

}
