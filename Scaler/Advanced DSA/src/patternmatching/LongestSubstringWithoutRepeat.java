package src.patternmatching;

import java.util.HashSet;

public class LongestSubstringWithoutRepeat {

    public int lengthOfLongestSubstring(String A) {
        int length = 1;
        int i = 0;
        int j = 0;
        HashSet<Character> set = new HashSet<>();
        while(j < A.length()) {
            char chr = A.charAt(j);
            while(set.contains(chr)) {
                set.remove(A.charAt(i));
                i++;
            }
            set.add(chr);
            length = Math.max(length, set.size());
            j++;
        }
        return length;
    }

}
