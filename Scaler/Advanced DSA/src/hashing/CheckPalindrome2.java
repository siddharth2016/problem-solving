package src.hashing;

import java.util.HashMap;

public class CheckPalindrome2 {

    public int solve(String A) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char chr: A.toCharArray()) {
            map.put(chr, map.getOrDefault(chr, 0) + 1);
        }
        int countOdd = 0;
        for(int count: map.values()) {
            if(count % 2 == 1) countOdd++;
        }

        return (countOdd <= 1) ? 1 : 0;
    }

}
