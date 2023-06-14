package src.topinterview150;

import java.util.*;

public class LC_49_GroupAnagrams {

    public static void main(String[] args) {
        System.out.println(groupAnagrams(
                new String[] {
                        "eat","tea","tan","ate","nat","bat"
                }
        ));
    }

    public static String getString(char[] charArray) {
        StringBuilder sb = new StringBuilder();
        for(char chr: charArray) {
            sb.append(chr);
        }
        return sb.toString();
    }


    public static List<List<String>> groupAnagrams(String[] strs) {
        String[] sortedStrs = new String[strs.length];
        for(int i=0; i<strs.length; i++) {
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            sortedStrs[i] = getString(charArray);
        }

        Map<String, List<String>> map = new HashMap<>();
        for(int i=0; i<strs.length; i++) {
            if(!map.containsKey(sortedStrs[i])) {
                map.put(sortedStrs[i], new ArrayList<>());
            }
            map.get(sortedStrs[i]).add(strs[i]);
        }

        return new ArrayList<>(map.values());
    }

}
