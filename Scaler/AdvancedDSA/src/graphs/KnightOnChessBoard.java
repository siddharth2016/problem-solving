package src.graphs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class KnightOnChessBoard {

    class Pair {
        int i;
        int j;
        int cost;
        public Pair(int i, int j, int c) {
            this.i = i;
            this.j = j;
            this.cost = c;
        }
    }

    public int knight(int A, int B, int C, int D, int E, int F) {
        int[][] mat = new int[A][B];
        for(int[] arr: mat) {
            Arrays.fill(arr, -1);
        }
        mat[C-1][D-1] = 0;
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(C-1, D-1, 0));
        while(!queue.isEmpty()) {
            Pair pair = queue.poll();
            int x = pair.i;
            int y = pair.j;
            int cost = pair.cost;
            int[] dx = new int[]{-2, -1, 1, 2, 2, 1, -1, -2};
            int[] dy = new int[]{-1, -2, -2, -1, 1, 2, 2, 1};
            for(int i=0; i<8; i++) {
                if(0 <= (x+dx[i]) && ((x+dx[i]) < A) && 0 <= (y+dy[i]) && ((y+dy[i]) < B)) {
                    if(mat[x+dx[i]][y+dy[i]] == -1) {
                        mat[x+dx[i]][y+dy[i]] = mat[x][y] + 1;
                        queue.add(new Pair(x+dx[i], y+dy[i], mat[x][y]+1));
                    }
                }
            }
        }
        if(E*F <= A*B) return mat[E-1][F-1];
        return -1;
    }

}
