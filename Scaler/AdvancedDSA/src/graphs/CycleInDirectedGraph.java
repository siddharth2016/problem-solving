package src.graphs;

import java.util.ArrayList;
import java.util.List;

public class CycleInDirectedGraph {

    public int solve(int A, int[][] B) {
        // create adjList
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i=0; i<=A; i++) {
            adjList.add(new ArrayList<>());
        }
        for(int[] edge: B) {
            adjList.get(edge[0]).add(edge[1]);
        }

        int[] visited = new int[A+1];
        int[] stack = new int[A+1];
        boolean possible = false;
        for(int i=1; i<=A; i++) {
            if(visited[i] == 0) possible = dfs(adjList, visited, stack, i);
            if(possible) break;
        }

        return possible? 1: 0;
    }

    public boolean dfs(List<List<Integer>> adjList, int[] visited, int[] stack, int node) {
        if(visited[node] == 1 && stack[node] == 1) return true;
        if(visited[node] == 1 && stack[node] == 0) return false;
        visited[node] = 1;
        stack[node] = 1;
        boolean possible = false;
        for(int val: adjList.get(node)) {
            possible = possible || dfs(adjList, visited, stack, val);
        }
        stack[node] = 0;
        return possible;
    }

}
