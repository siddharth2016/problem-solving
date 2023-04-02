package src.heaps;

import java.util.PriorityQueue;

public class MinLargestElement {

    class Pair {
        int total;
        int original;

        public Pair(int total, int original) {
            this.total = total;
            this.original = original;
        }
    }

    public int solve(int[] A, int B) {
        PriorityQueue<Pair> minHeap = new PriorityQueue<>(
                (pair1, pair2) -> {
                    int val1 = pair1.total + pair1.original;
                    int val2 = pair2.total + pair2.original;
                    return Integer.compare(val1, val2);
                }
        );
        int minLargest = Integer.MIN_VALUE;
        for(int val: A) {
            minHeap.add(new Pair(val, val));
            minLargest = Integer.max(minLargest, val);
        }
        while(B != 0) {
            Pair tempPair = minHeap.poll();
            tempPair.total += tempPair.original;
            minLargest = Integer.max(minLargest, tempPair.total);
            minHeap.add(tempPair);
            B--;
        }
        return minLargest;
    }

}
