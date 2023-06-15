package src.topinterview150.hashmap;

import java.util.HashMap;
import java.util.Map;

public class LC_290_WordPattern {

    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat dog"));
    }

    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(words.length != pattern.length()) return false;

        Map<Character, String> map = new HashMap<>();
        int i = 0;
        for(char chr: pattern.toCharArray()) {
            if(map.containsKey(chr) && !map.get(chr).equals(words[i])) return false;
            map.put(chr, words[i]);
            i++;
        }

        Map<String, Character> map2 = new HashMap<>();
        i = 0;
        for(String str: words) {
            if(map2.containsKey(str) && map2.get(str) != pattern.charAt(i)) return false;
            map2.put(str, pattern.charAt(i));
            i++;
        }
        return true;
    }
}
