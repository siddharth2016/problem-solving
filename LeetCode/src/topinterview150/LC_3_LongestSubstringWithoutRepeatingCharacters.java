package src.topinterview150;

import java.util.HashSet;
import java.util.Set;

public class LC_3_LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        int maxLength = Integer.MIN_VALUE;
        Set<Character> set = new HashSet<>();
        int i = 0;
        for(int j=0; j<s.length(); j++) {
            if(set.contains(s.charAt(j))) {
                maxLength = Integer.max(maxLength, set.size());
                while(set.contains(s.charAt(j))) {
                    set.remove(s.charAt(i));
                    i++;
                }
            }
            set.add(s.charAt(j));
        }
        maxLength = Integer.max(maxLength, set.size());
        return maxLength;
    }

}
