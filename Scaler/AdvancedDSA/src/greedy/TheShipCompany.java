package src.greedy;

import java.util.Collections;
import java.util.PriorityQueue;

public class TheShipCompany {

    public int[] solve(int A, int B, int[] C) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int val: C) {
            minHeap.add(val);
            maxHeap.add(val);
        }
        int minCost = 0;
        int maxCost = 0;
        while(A != 0) {
            minCost += minHeap.peek();
            maxCost += maxHeap.peek();
            int minVal = minHeap.poll() - 1;
            if(minVal > 0) minHeap.add(minVal);
            int maxVal = maxHeap.poll() - 1;
            if(maxVal > 0) maxHeap.add(maxVal);
            A--;
        }
        return new int[]{maxCost, minCost};
    }

}
