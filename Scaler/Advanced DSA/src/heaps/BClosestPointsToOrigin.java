package src.heaps;

import java.util.PriorityQueue;

public class BClosestPointsToOrigin {

    class Pair {
        int x;
        int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int[][] solve(int[][] A, int B) {
        PriorityQueue<Pair> minHeap = new PriorityQueue<>(
                (pair1, pair2) -> {
                    float sqrt1 = (float)Math.sqrt(Math.pow(pair1.x, 2) + Math.pow(pair1.y, 2));
                    float sqrt2 = (float)Math.sqrt(Math.pow(pair2.x, 2) + Math.pow(pair2.y, 2));
                    if(sqrt1 < sqrt2) return -1;
                    if(sqrt1 > sqrt2) return 1;
                    return 0;
                }
        );
        for(int[] pair: A) {
            minHeap.add(new Pair(pair[0], pair[1]));
        }
        int[][] result = new int[B][2];
        int i = 0;
        while(B > 0) {
            Pair pair = minHeap.poll();
            result[i][0] = pair.x;
            result[i][1] = pair.y;
            i++; B--;
        }
        return result;
    }

}
