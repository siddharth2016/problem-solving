package practiceproblems.carryfwd;

import java.util.ArrayList;

public class Bulbs {

    public int bulbs(ArrayList<Integer> A) {
        int count = 0;
        int latest = -1;
        for(int i=0; i<A.size(); i++) {
            if(A.get(i) == 0 && latest!=0) {
                count++;
                latest = 0;
            }
            else if(A.get(i) == 1 && latest == 0) {
                count++;
                latest = 1;
            }
        }
        return count;
    }

}
