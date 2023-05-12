package src.graphs;

import java.util.ArrayList;
import java.util.Arrays;

public class CheckBipartiteGraph {

    public int solve(int A, int[][] B) {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for(int i=0; i<A; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int[] ints : B) {
            adjList.get(ints[0]).add(ints[1]);
            adjList.get(ints[1]).add(ints[0]);
        }
        int[] traversed = new int[A];
        Arrays.fill(traversed, -1);
        boolean ans = true;
        for(int i=0; i<A; i++) {
            if(traversed[i] == -1) ans = ans && dfs(adjList, traversed, 1, i);
        }
        return ans ? 1 : 0;
    }

    public boolean dfs(ArrayList<ArrayList<Integer>> adjList, int[] traversed, int type, int start) {
        traversed[start] = type;
        boolean possible = true;
        for(int val: adjList.get(start)) {
            if(traversed[val] == type) return false;
            else if(traversed[val] == 1-type) continue;
            else possible = possible && dfs(adjList, traversed, 1-type, val);

        }
        return possible;
    }

}
