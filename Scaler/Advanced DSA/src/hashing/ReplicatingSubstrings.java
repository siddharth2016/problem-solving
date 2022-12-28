package src.hashing;

import java.util.HashMap;

public class ReplicatingSubstrings {

    public int solve(int A, String B) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(char val: B.toCharArray()) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        for(int val: map.values()) {
            if(val % A != 0) return -1;
        }

        return 1;
    }

}
