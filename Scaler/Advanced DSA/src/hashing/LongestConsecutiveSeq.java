package src.hashing;

import java.util.HashSet;

public class LongestConsecutiveSeq {

    public int longestConsecutive(final int[] A) {
        HashSet<Integer> set = new HashSet<>();
        for(int val: A) {
            set.add(val);
        }
        int maxLen = Integer.MIN_VALUE;

        for(int val: A) {
            if(!set.contains(val-1)) {
                int count = 1;
                int next = val + 1;
                while(set.contains(next)) {
                    next++;
                    count++;
                }
                maxLen = Math.max(maxLen, count);
            }
        }
        return maxLen;
    }

}
