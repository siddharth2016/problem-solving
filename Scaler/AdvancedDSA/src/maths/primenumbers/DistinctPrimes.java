package src.maths.primenumbers;

import java.util.ArrayList;
import java.util.HashSet;

public class DistinctPrimes {

    public void primefactors(int elem, HashSet<Integer> hs) {
        for(int i=2; i * i<=elem; i++) {
            if(elem % i == 0) {
                while(elem % i == 0) {
                    elem = elem / i;
                }
                hs.add(i);
            }
        }
        if(elem > 1) hs.add(elem);
    }

    public int solve(ArrayList<Integer> A) {
        HashSet<Integer> hs = new HashSet<>();
        for(int elem: A) {
            primefactors(elem, hs);
        }
        return hs.size();
    }

}
