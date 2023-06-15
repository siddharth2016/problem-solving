package src.topinterview150.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LC_76_MinimumWindowSubstring {

    public String minWindow(String s, String t) {
        Map<Character, Integer> freq = new HashMap<>();
        for(Character chr: t.toCharArray()) {
            freq.put(chr, freq.getOrDefault(chr, 0) + 1);
        }

        int minLen = Integer.MAX_VALUE;
        int start = -1;
        int end = -1;

        int i = 0;
        int j = 0;
        int count = 0;
        Map<Character, Integer> temp = new HashMap<>();
        while(j < s.length()) {
            char chr = s.charAt(j);
            if(freq.containsKey(chr)) {
                temp.put(chr, temp.getOrDefault(chr, 0) + 1);
                if(temp.get(chr) <= freq.get(chr)) count++;
            }

            while(i <= j && count == t.length()) {
                minLen = Integer.min(minLen, j-i+1);
                if(minLen == j-i+1) {
                    start = i;
                    end = j;
                }

                char chr2 = s.charAt(i);
                if(freq.containsKey(chr2)) {
                    temp.put(chr2, temp.get(chr2) - 1);
                    if(temp.get(chr2) < freq.get(chr2)) count--;
                }

                i++;
            }
            j++;
        }

        if(start == -1) return "";
        return s.substring(start, end+1);
    }

}
