package src.greedy;

import java.util.PriorityQueue;

public class FinishMaximumJobs {

    class Pair {
        int start;
        int end;

        public Pair(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public int solve(int[] A, int[] B) {
        PriorityQueue<Pair> minHeap = new PriorityQueue<>(
                (pair1, pair2) -> {
                    if(pair1.end != pair2.end) return Integer.compare(pair1.end, pair2.end);
                    else return Integer.compare(pair1.start, pair2.start);
                }
        );

        for(int i=0; i<A.length; i++) {
            minHeap.add(new Pair(A[i], B[i]));
        }

        int countJobs = 1;
        Pair currPair = minHeap.poll();

        while(minHeap.size() != 0) {
            Pair tempPair = minHeap.poll();
            if(tempPair.start >= currPair.end) {
                countJobs++;
                currPair = tempPair;
            }
        }
        return countJobs;
    }

}
