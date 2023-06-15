package src.topinterview150.hashmap;

import java.util.HashSet;
import java.util.Set;

public class LC_128_LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int val: nums) {
            set.add(val);
        }

        int maxLength = 0;

        for(int val: nums) {
            int current = val;
            int currentLength = 1;

            while(set.contains(--current)) {
                currentLength++;
                set.remove(current);
            }

            current = val;
            while(set.contains(++current)) {
                currentLength++;
                set.remove(current);
            }

            maxLength = Integer.max(maxLength, currentLength);
        }

        return maxLength;
    }

}
