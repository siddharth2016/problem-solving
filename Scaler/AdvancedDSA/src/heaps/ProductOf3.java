package src.heaps;

import java.util.Collections;
import java.util.PriorityQueue;
public class ProductOf3 {

    public int[] solve(int[] A) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int first, second, last;
        int[] result = new int[A.length];
        for(int i=0; i<A.length; i++) {
            maxHeap.add(A[i]);
            if(maxHeap.size() < 3) result[i] = -1;
            else {
                first = maxHeap.poll();
                second = maxHeap.poll();
                last = maxHeap.poll();
                result[i] = first*second*last;
                maxHeap.add(first);
                maxHeap.add(second);
                maxHeap.add(last);
            }
        }
        return result;
    }

}
