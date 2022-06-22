package practiceproblems.week8.strings;

import java.util.ArrayList;

public class VowelsVsConsonants {

    public ArrayList<Integer> solve(String A) {
        int cons = 0;
        int vow = 0;
        for(Character chr: A.toCharArray()) {
            if(chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u') vow++;
            else cons++;
        }
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(vow);
        arr.add(cons);
        return arr;
    }

}
