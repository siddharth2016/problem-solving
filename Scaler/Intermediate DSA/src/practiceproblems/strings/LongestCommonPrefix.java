package practiceproblems.strings;

import java.util.ArrayList;
import java.util.Collections;

public class LongestCommonPrefix {

    public String matchPrefix(String prefix, String str) {
        int i = 0;
        for(i=0; i<prefix.length(); i++) {
            if(prefix.charAt(i) != str.charAt(i)) break;
        }
        return prefix.substring(0, i);
    }

    public String longestCommonPrefix(ArrayList<String> A) {
        Collections.sort(A, (a, b) -> {
            if(a.length() < b.length()) return -1;
            else if(a.length() > b.length()) return 1;
            else return a.compareTo(b);
        });
        String prefix = A.get(0);
        for(int i=1; i<A.size(); i++) {
            prefix = matchPrefix(prefix, A.get(i));
        }
        return prefix;
    }

}
