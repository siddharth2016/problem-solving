package src.graphs;

import java.util.ArrayList;
import java.util.List;

public class PossibilityOfFinishing {

    public int solve(int A, int[] B, int[] C) {
        // construct a graph
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i=0; i<=A; i++) {
            adjList.add(new ArrayList<>());
        }
        for(int i=0; i<B.length; i++) {
            adjList.get(B[i]).add(C[i]);
        }

        // find if cycle exists
        int[] visited = new int[A+1];
        int[] stack = new int[A+1];
        boolean possible = true;
        for(int i=1; i<=A; i++) {
            if(visited[i] == 0) possible = dfsCycle(adjList, visited, stack, i);
            if(!possible) break;
        }

        // return 1 if possible else 0
        return possible ? 1 : 0;
    }

    public boolean dfsCycle(List<List<Integer>> adjList, int[] visited, int[] stack, int node) {
        if(visited[node] == 1 && stack[node] == 1) return false;
        if(visited[node] == 1) return true;
        visited[node] = 1;
        stack[node] = 1;
        boolean possible = true;
        for(int val: adjList.get(node)) {
            possible = possible && dfsCycle(adjList, visited, stack, val);
        }
        stack[node] = 0;
        return possible;
    }

}
