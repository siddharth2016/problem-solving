package src;

import java.util.HashMap;
import java.util.Map;

public class LC_409_LongestPalindrome {

    public int longestPalindrome(String s) {
        boolean containsOdd = false;
        Map<Character, Integer> map = new HashMap<>();
        for(Character chr: s.toCharArray()) {
            map.put(chr, map.getOrDefault(chr, 0) + 1);
        }
        int len = 0;
        for(Integer freq: map.values()) {
            if(freq % 2 != 0) {
                containsOdd = true;
                len += (freq-1);
            }
            else {
                len += freq;
            }
        }
        if(containsOdd) return len+1;
        return len;
    }

}
