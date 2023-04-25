package src.heaps;

import java.util.PriorityQueue;

public class AthLargestElement {

    public int[] solve(int A, int[] B) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int[] result = new int[B.length];
        for(int i=0; i<A; i++) {
            minHeap.add(B[i]);
            if(i != A-1) result[i] = -1;
            else result[i] = minHeap.peek();
        }
        for(int i=A; i<B.length; i++) {
            if(minHeap.peek() < B[i]) {
                minHeap.poll();
                minHeap.add(B[i]);
            }
            result[i] = minHeap.peek();
        }
        return result;
    }

}
