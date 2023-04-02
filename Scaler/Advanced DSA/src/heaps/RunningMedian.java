package src.heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class RunningMedian {

    public int[] solve(int[] A) {
        int[] result = new int[A.length];
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        result[0] = A[0];
        maxHeap.add(A[0]);
        for(int i=1; i<A.length; i++) {
            int val = A[i];
            if(val <= result[i-1]) maxHeap.add(val);
            else minHeap.add(val);
            int minSize = minHeap.size();
            int maxSize = maxHeap.size();
            if(minSize > maxSize && Math.abs(minSize - maxSize) > 1) {
                maxHeap.add(minHeap.poll());
                minSize = minHeap.size();
                maxSize = maxHeap.size();
            }
            else if(minSize < maxSize && Math.abs(minSize - maxSize) > 1) {
                minHeap.add(maxHeap.poll());
                minSize = minHeap.size();
                maxSize = maxHeap.size();
            }
            if(minSize == maxSize) {
                result[i] = maxHeap.peek();
            }
            else if(minSize < maxSize) {
                result[i] = maxHeap.peek();
            }
            else {
                result[i] = minHeap.peek();
            }
        }
        return result;
    }

}
