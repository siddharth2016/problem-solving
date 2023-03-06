package src.queue;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

public class FirstNonRepeatingCharacter {

    public String solve(String A) {
        HashMap<Character, Integer> freq = new HashMap<>();
        Deque<Character> dq = new LinkedList<>();
        StringBuilder result = new StringBuilder();
        for(Character chr: A.toCharArray()) {
            freq.put(chr, freq.getOrDefault(chr, 0) + 1);
            dq.addLast(chr);
            while(dq.size() != 0 && freq.get(dq.peekFirst()) != 1) {
                dq.removeFirst();
            }
            if(dq.size() != 0) result.append(dq.peekFirst());
            else result.append("#");
        }
        return result.toString();
    }

}
