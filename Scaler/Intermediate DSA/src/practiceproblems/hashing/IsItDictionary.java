package practiceproblems.hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class IsItDictionary {

    public boolean checkLexicographical(String first, String second, HashMap<Character, Integer> hm) {
        int len = Math.min(first.length(), second.length());
        int i=0;
        while(i < len) {
            if(hm.get(first.charAt(i)) < hm.get(second.charAt(i))) return true;
            else if(hm.get(first.charAt(i)) > hm.get(second.charAt(i))) return false;
            i++;
        }
        if(second.length() < first.length()) return false;
        return true;
    }

    public int solve(ArrayList<String> A, String B) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=1; i<=B.length(); i++) {
            hm.put(B.charAt(i-1), i);
        }

        int len = A.size();
        if(len == 1) return 1;

        for(int i=1; i<len; i++) {
            if(!checkLexicographical(A.get(i-1), A.get(i), hm)) return 0;
        }

        return 1;
    }

}
