package src.heaps;

import java.util.PriorityQueue;

public class KPlacesApart {

    public int[] solve(int[] A, int B) {
        int[] result = new int[A.length];
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        if(B == 0) return A;
        for(int i=0; i<B; i++) {
            minHeap.add(A[i]);
        }
        int j = 0;
        for(int i=B; i<A.length; i++) {
            minHeap.add(A[i]);
            result[j++] = minHeap.poll();
        }
        while(minHeap.size() != 0) {
            result[j++] = minHeap.poll();
        }
        return result;
    }

}
