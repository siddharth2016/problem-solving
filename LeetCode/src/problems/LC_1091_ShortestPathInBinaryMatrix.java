package src.problems;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class LC_1091_ShortestPathInBinaryMatrix {

    public static void main(String[] args) {
        System.out.println(shortestPathBinaryMatrix(new int[][]{
                {0, 1},
                {1, 0}
        }));
    }

    static class Pair {
        int i;
        int j;

        public Pair(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }

    public static int shortestPathBinaryMatrix(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] visited = new int[rows][cols];
        for (int[] arr : visited) {
            Arrays.fill(arr, -1);
        }
        return bfs(grid, visited);
    }

    public static int bfs(int[][] grid, int[][] visited) {
        if (grid[0][0] == 1) return -1;

        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(0, 0));
        visited[0][0] = 1;
        while (!queue.isEmpty()) {
            Pair pair = queue.poll();
            int i = pair.i;
            int j = pair.j;
            int[] dx = new int[]{-1, -1, 0, 1, 1, 1, 0, -1};
            int[] dy = new int[]{0, -1, -1, -1, 0, 1, 1, 1};
            for (int k = 0; k < 8; k++) {
                if (0 <= i + dx[k] && i + dx[k] < grid.length &&
                        0 <= j + dy[k] && j + dy[k] < grid[0].length &&
                        grid[i + dx[k]][j + dy[k]] != 1 && visited[i + dx[k]][j + dy[k]] == -1) {
                    visited[i + dx[k]][j + dy[k]] = visited[i][j] + 1;
                    queue.add(new Pair(i + dx[k], j + dy[k]));
                }
            }
        }

        return visited[grid.length - 1][grid[0].length - 1];
    }
}
