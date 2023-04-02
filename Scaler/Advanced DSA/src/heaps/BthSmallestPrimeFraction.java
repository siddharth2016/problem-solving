package src.heaps;

import java.util.PriorityQueue;

public class BthSmallestPrimeFraction {
    class Pair {
        float x;
        float y;

        public Pair(int x, int y) {
            this.x = (float)x;
            this.y = (float)y;
        }
    }

    public int[] solve(int[] A, int B) {
        PriorityQueue<Pair> minHeap = new PriorityQueue<>(
                (pair1, pair2) -> {
                    float fraction1 = pair1.x / pair1.y;
                    float fraction2 = pair2.x / pair2.y;
                    return Float.compare(fraction1, fraction2);
                }
        );

        for(int i=0; i<A.length-1; i++) {
            for(int j=i+1; j<A.length; j++) {
                minHeap.add(new Pair(A[i], A[j]));
            }
        }
        Pair result = minHeap.peek();
        while(B != 0) {
            result = minHeap.poll();
            B--;
        }
        return new int[]{(int)result.x, (int)result.y};
    }

}
