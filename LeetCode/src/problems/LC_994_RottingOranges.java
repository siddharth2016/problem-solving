package src.problems;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class LC_994_RottingOranges {

    class Pair {
        int x;
        int y;
        public Pair(int i, int j) {
            x = i;
            y = j;
        }
    }
    public int orangesRotting(int[][] grid) {
        Queue<Pair> queue = new LinkedList<>();
        int[][] visited = new int[grid.length][grid[0].length];
        for(int[] arr: visited) {
            Arrays.fill(arr, -1);
        }
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                if(grid[i][j] == 2) {
                    queue.add(new Pair(i, j));
                    visited[i][j] = 0;
                }
            }
        }
        while(!queue.isEmpty()) {
            Pair pair = queue.poll();
            int i = pair.x;
            int j = pair.y;

            if(i+1<grid.length && grid[i+1][j] == 1 && visited[i+1][j] == -1) {
                visited[i+1][j] = visited[i][j] + 1;
                queue.add(new Pair(i+1, j));
            }

            if(j+1<grid[0].length && grid[i][j+1] == 1 && visited[i][j+1] == -1) {
                visited[i][j+1] = visited[i][j] + 1;
                queue.add(new Pair(i, j+1));
            }

            if(i-1>=0 && grid[i-1][j] == 1 && visited[i-1][j] == -1) {
                visited[i-1][j] = visited[i][j] + 1;
                queue.add(new Pair(i-1, j));
            }

            if(j-1>=0 && grid[i][j-1] == 1 && visited[i][j-1] == -1) {
                visited[i][j-1] = visited[i][j] + 1;
                queue.add(new Pair(i, j-1));
            }
        }

        int ans = 0;
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                if(visited[i][j] == -1 && grid[i][j] == 1) {
                    return -1;
                }
                ans = Integer.max(ans, visited[i][j]);
            }
        }
        return ans;
    }

}
