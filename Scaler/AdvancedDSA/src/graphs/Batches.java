package src.graphs;

import java.util.ArrayList;
import java.util.List;

public class Batches {

    public int solve(int A, int[] B, int[][] C, int D) {
        // construct undirected graph
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i=0; i<=A; i++) {
            adjList.add(new ArrayList<>());
        }
        for(int[] edge: C) {
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }

        // call dfs on un-visited nodes
        int[] visited = new int[A+1];
        int cost = 0;
        int result = 0;
        for(int i=1; i<=A; i++) {
            if(visited[i] == 0) {
                cost = dfs(adjList, visited, B, i);
                if(cost >= D) result++;
            }
        }
        return result;
    }

    public int dfs(List<List<Integer>> adjList, int[] visited, int[] weights, int node) {
        if(visited[node] == 1) return 0;
        visited[node] = 1;
        int cost = weights[node-1];
        for(int val: adjList.get(node)) {
            cost += dfs(adjList, visited, weights, val);
        }
        return cost;
    }

}
