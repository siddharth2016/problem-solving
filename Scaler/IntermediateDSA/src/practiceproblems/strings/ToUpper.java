package practiceproblems.strings;

import java.util.ArrayList;

public class ToUpper {

    public ArrayList<Character> to_upper(ArrayList<Character> A) {
        for(int i=0; i<A.size(); i++) {
            char chr = A.get(i);
            if('a' <= chr && chr <= 'z') chr ^= 32;
            A.set(i, chr);
        }
        return A;
    }

}
