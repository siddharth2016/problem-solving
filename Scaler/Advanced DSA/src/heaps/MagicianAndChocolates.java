package src.heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class MagicianAndChocolates {

    public int nchoc(int A, int[] B) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int val: B) {
            maxHeap.add(val);
        }
        long result = 0l;
        int mod = (int)Math.pow(10, 9) + 7;
        while(A > 0) {
            int maxElem = maxHeap.poll();
            if(maxElem == 0) break;
            result = (result % mod + maxElem % mod) % mod;
            maxHeap.add(maxElem / 2);
            A--;
        }
        return (int)result;
    }

}
