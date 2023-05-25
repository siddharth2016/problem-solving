package src.graphs;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class ShortestDistanceInAMaze {

    public int solve(int[][] maze, int[] start, int[] destination) {
        int m = maze.length;
        int n = maze[0].length;

        int[][] dirs = {{1, 0}, {0, 1}, {0, -1}, {-1, 0}};
        int[][] distance = new int[m][n];

        for (int[] row: distance) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        Deque<int[]> queue = new ArrayDeque<>();

        queue.offer(start);
        distance[start[0]][start[1]] = 0;

        while (!queue.isEmpty()) {
            int[] p = queue.poll();

            for (int[] dir: dirs) {
                int nrow = p[0];
                int ncol = p[1];
                int count = 0;

                while (canRoll(maze, nrow + dir[0], ncol + dir[1])) {
                    nrow += dir[0];
                    ncol += dir[1];
                    count++;
                }

                // Update the distance[][], and use to check if a position is visited or not
                if (distance[p[0]][p[1]] + count < distance[nrow][ncol]) {
                    distance[nrow][ncol] = distance[p[0]][p[1]] + count;
                    queue.offer(new int[] {nrow, ncol});
                }

            }
        }
        return distance[destination[0]][destination[1]] == Integer.MAX_VALUE ?
                -1 :
                distance[destination[0]][destination[1]];
    }

    private boolean canRoll(int[][] maze, int nrow, int ncol) {
        int m = maze.length;
        int n = maze[0].length;
        return nrow >= 0 && nrow < m && ncol >= 0 && ncol < n && maze[nrow][ncol] == 0;
    }

}
