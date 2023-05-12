package src.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PathInDirectedGraph {

    public int solve(int A, int[][] B) {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for(int i=0; i<=A; i++) {
            adjList.add(new ArrayList<>());
        }
        int[] traversed = new int[A+1];
        for (int[] ints : B) {
            int start = ints[0];
            int end = ints[1];
            adjList.get(start).add(end);
        }

        return bfs(adjList, traversed, 1, A);
    }

    public int bfs(ArrayList<ArrayList<Integer>> adjList, int[] traversed, int start, int end) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        while(!queue.isEmpty()) {
            int node = queue.poll();
            traversed[node] = 1;
            for(int val: adjList.get(node)) {
                if(traversed[val] != 1) queue.add(val);
            }
        }
        return traversed[end];
    }

}
