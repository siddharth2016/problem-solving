package src.graphs;

import java.util.ArrayList;

public class DepthFirstSearch {

    public int solve(int[] A, final int B, final int C) {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for(int i=0; i<=A.length; i++) {
            adjList.add(new ArrayList<>());
        }
        for(int i=1; i<A.length; i++) {
            adjList.get(A[i]).add(i+1);
        }
        int[] traversed = new int[A.length+1];
        dfs(adjList, traversed, C);
        return traversed[B];
    }

    public void dfs(ArrayList<ArrayList<Integer>> adjList, int[] traversed, int start) {
        if(traversed[start] == 1) return;
        traversed[start] = 1;
        for(int val: adjList.get(start)) {
            if(traversed[val] != 1) dfs(adjList, traversed, val);
        }
    }

}
