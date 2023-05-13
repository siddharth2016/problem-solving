package src.graphs;

import java.util.*;

public class CycleInUndirectedGraph {

    public int solve(int A, int[][] B) {
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i=0; i<=A; i++) {
            adjList.add(new ArrayList<>());
        }
        for(int[] edge: B) {
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }
        int[] traversed = new int[A+1];
        Arrays.fill(traversed, -1);
        boolean possible = false;
        for(int i=1; i<=A; i++) {
            if(traversed[i] == -1) possible = bfs(adjList, traversed, i);
            if(possible) break;
        }
        return possible ? 1 : 0;
    }

    public boolean bfs(List<List<Integer>> adjList, int[] traversed, int node) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);
        boolean containsCycle = false;
        while(!queue.isEmpty()) {
            int val = queue.poll();
            if(traversed[val] == 1) {
                containsCycle = true;
                break;
            }
            traversed[val] = 1;
            for(int otherNode: adjList.get(val)) {
                if(traversed[otherNode] == -1) queue.add(otherNode);
            }
        }
        return containsCycle;
    }

}
