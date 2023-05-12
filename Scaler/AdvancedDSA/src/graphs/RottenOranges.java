package src.graphs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {

    public static void main(String[] args) {
        System.out.println(solve(new int[][]{
                {0,0,1,1,1,1},
                {1,2,1,1,0,2},
                {0,0,2,2,1,1},
                {1,1,1,1,0,0},
                {1,2,0,0,0,1},
                {1,0,2,1,2,0}
        }));
    }

    static class Pair {
        int first;
        int second;
        public Pair(int i, int j) {
            first = i;
            second = j;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "first=" + first +
                    ", second=" + second +
                    '}';
        }
    }

    public static int solve(int[][] A) {
        int[][] visited = new int[A.length][A[0].length];
        Queue<Pair> queue = new LinkedList<>();
        for(int i=0; i<A.length; i++) {
            for(int j=0; j<A[0].length; j++) {
                if(A[i][j] == 2) {
                    queue.add(new Pair(i, j));
                }
            }
        }
        System.out.println(queue);
        bfs(A, visited, queue);
        System.out.println(Arrays.deepToString(visited));
        int ans = Integer.MIN_VALUE;
        for(int i=0; i<A.length; i++) {
            for(int j=0; j<A[0].length; j++) {
                if(A[i][j] == 1 && visited[i][j] == 0) {
                    return -1;
                }
                ans = Integer.max(ans, visited[i][j]);
            }
        }
        return ans == 0 ? -1 : ans;
    }

    public static void bfs(int[][] arr, int[][] visited, Queue<Pair> queue) {
        int rows = arr.length;
        int cols = arr[0].length;
        while(!queue.isEmpty()) {
            Pair pair = queue.poll();
            int i = pair.first;
            int j = pair.second;
            if(i + 1 < rows && arr[i+1][j] == 1 && visited[i+1][j] == 0) {
                visited[i+1][j] = visited[i][j] + 1;
                queue.add(new Pair(i+1, j));
            }
            if(j + 1 < cols && arr[i][j+1] == 1 && visited[i][j+1] == 0) {
                visited[i][j+1] = visited[i][j] + 1;
                queue.add(new Pair(i, j+1));
            }
            if(i - 1 >= 0 && arr[i-1][j] == 1 && visited[i-1][j] == 0) {
                visited[i-1][j] = visited[i][j] + 1;
                queue.add(new Pair(i-1, j));
            }
            if(j - 1 >= 0 && arr[i][j-1] == 1 && visited[i][j-1] == 0) {
                visited[i][j-1] = visited[i][j] + 1;
                queue.add(new Pair(i, j-1));
            }
        }
    }

}
