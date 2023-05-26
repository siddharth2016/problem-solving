package src.graphs;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class SmallestSequenceWithGivenPrimes {

    public int[] solve(int A, int B, int C, int D) {
        int[] result = new int[D];
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int[] arr = new int[]{A, B, C};
        Set<Integer> visited = new HashSet<>();
        for(int val: arr) {
            if(!visited.contains(val)) {
                visited.add(val);
                minHeap.add(val);
            }
        }

        for(int i=0; i<D; i++) {
            int val = minHeap.poll();
            result[i] = val;
            for(int prime: arr) {
                if(!visited.contains(prime*val)) {
                    visited.add(prime*val);
                    minHeap.add(prime*val);
                }
            }
        }

        return result;
    }

}
