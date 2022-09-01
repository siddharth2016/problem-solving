package practiceproblems.strings;

import java.util.ArrayList;

public class ToLower {

    public ArrayList<Character> to_lower(ArrayList<Character> A) {
        for(int i=0; i<A.size(); i++) {
            char chr = A.get(i);
            if('A' <= chr && chr <= 'Z') chr ^= 32;
            A.set(i, chr);
        }
        return A;
    }

}
