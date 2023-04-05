package src.backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LetterPhone {
    Map<Character, String> map;
    StringBuilder sb;
    ArrayList<String> result;
    public ArrayList<String> letterCombinations(String A) {
        map = new HashMap<>();
        sb = new StringBuilder();
        result = new ArrayList<>();
        map.put('0', "0");
        map.put('1', "1");
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        totalCombinations(A, 0);
        return result;
    }

    public void totalCombinations(String str, int index) {
        if(index == str.length()) {
            result.add(sb.toString());
            return;
        }
        String keys = map.get(str.charAt(index));
        for(Character chr: keys.toCharArray()) {
            sb.append(chr);
            totalCombinations(str, index+1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
