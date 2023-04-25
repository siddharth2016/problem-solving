package src.heaps;

import java.util.PriorityQueue;

public class KthSmallestElementInSortedMatrix {

    public int solve(int[][] A, int B) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i=0; i<A.length; i++) {
            for(int j=0; j<A[0].length; j++) {
                minHeap.add(A[i][j]);
            }
        }
        int result = minHeap.peek();
        while(B != 0) {
            result = minHeap.poll();
            B--;
        }
        return result;
    }
}
