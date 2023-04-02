package src.heaps;

import java.util.PriorityQueue;

public class ConnectRopes {
    public int solve(int[] A) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int minCost = 0;
        for(int val: A) {
            minHeap.add(val);
        }
        while(minHeap.size() != 0) {
            int first = minHeap.poll();
            int second = 0;
            if(minHeap.size() != 0) second = minHeap.poll();
            minCost += first + second;
            if(minHeap.size() != 0) minHeap.add(first + second);
        }
        return minCost;
    }

}
