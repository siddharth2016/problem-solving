package src.graphs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class DistanceOfNearestCell {

    class Pair {
        int x;
        int y;
        public Pair(int i, int j) {
            x = i;
            y = j;
        }
    }

    public int[][] solve(int[][] A) {
        Queue<Pair> queue = new LinkedList<>();
        int[][] traversed = new int[A.length][A[0].length];
        for(int[] arr: traversed) {
            Arrays.fill(arr, Integer.MAX_VALUE);
        }
        for(int i=0; i<A.length; i++) {
            for(int j=0; j<A[0].length; j++) {
                if(A[i][j] == 1) {
                    queue.add(new Pair(i, j));
                    traversed[i][j] = 0;
                }
            }
        }
        bfs(A, traversed, queue);
        return traversed;
    }

    public void bfs(int[][] A, int[][] traversed, Queue<Pair> queue) {
        int[] dx = new int[]{-1, 1, 0, 0};
        int[] dy = new int[]{0, 0, -1, 1};
        while(!queue.isEmpty()) {
            Pair pair = queue.poll();
            for(int i=0; i<dx.length; i++) {
                if(pair.x+dx[i] >=0 && pair.x+dx[i] < A.length && pair.y+dy[i] >= 0 && pair.y + dy[i] < A[0].length){
                    if(traversed[pair.x+dx[i]][pair.y+dy[i]] != 0 &&
                            traversed[pair.x+dx[i]][pair.y+dy[i]] == Integer.MAX_VALUE) {
                        traversed[pair.x+dx[i]][pair.y+dy[i]] = traversed[pair.x][pair.y] + 1;
                        queue.add(new Pair(pair.x+dx[i], pair.y+dy[i]));
                    }
                }
            }
        }
    }

}
