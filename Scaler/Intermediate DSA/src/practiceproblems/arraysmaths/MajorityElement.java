package practiceproblems.arraysmaths;

import java.util.List;

public class MajorityElement {

    public int majorityElement(final List<Integer> A) {
        int elem = A.get(0);
        int freq = 1;
        for(int i=1; i<A.size(); i++) {
            int val = A.get(i);
            if(freq == 0) {
                elem = val;
                freq = 1;
            }
            else if(elem != val) {
                freq--;
            }
            else {
                freq++;
            }
        }
        return elem;
    }

}
