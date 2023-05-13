package src.graphs;

import java.util.ArrayList;
import java.util.Arrays;

public class ConstructRoads {

    public int solve(int A, int[][] B) {
        int mod = (int)Math.pow(10, 9) + 7;
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for(int i=0; i<=A; i++) {
            adjList.add(new ArrayList<>());
        }
        for(int[] edge: B) {
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }
        int[] traversed = new int[A+1];
        Arrays.fill(traversed, -1);
        dfs(adjList, traversed, 1, 1);
        long ones = 0L;
        long zeros = 0L;
        for(int val: traversed) {
            if(val == 1) ones = (ones % mod + 1) % mod;
            else if(val == 0) zeros = (zeros % mod + 1) % mod;
        }
        return (int)((ones % mod * zeros % mod) % mod - B.length % mod + mod) % mod;
    }

    public void dfs(ArrayList<ArrayList<Integer>> adjList, int[] traversed, int color, int node) {
        traversed[node] = color;
        for(int val: adjList.get(node)) {
            if(traversed[val] == -1) dfs(adjList, traversed, 1-color, val);
        }
    }

}
