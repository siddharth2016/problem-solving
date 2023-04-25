package practiceproblems.hashing;

import java.util.HashMap;
import java.util.Map;

public class CheckPalindrome2 {

    public int solve(String A) {
        Map<Character, Integer> map = new HashMap<>();
        for(char elem: A.toCharArray()) {
            map.put(elem, map.getOrDefault(elem , 0) + 1);
        }
        int result = 0;
        for(char key: map.keySet()) {
            result += map.get(key) % 2;
        }
        if(result <= 1) return 1;
        return 0;
    }
}
