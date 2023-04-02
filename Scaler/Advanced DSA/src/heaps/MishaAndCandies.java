package src.heaps;

import java.util.PriorityQueue;

public class MishaAndCandies {

    public int solve(int[] A, int B) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int val: A) {
            minHeap.add(val);
        }
        int result = 0;
        while(minHeap.size() != 0) {
            int first = minHeap.poll();
            if(first > B) break;
            result += first / 2;
            int second = 0;
            if(minHeap.size() != 0) {
                second = minHeap.poll();
                second += first - first/2;
                minHeap.add(second);
            }
        }
        return result;
    }
}
