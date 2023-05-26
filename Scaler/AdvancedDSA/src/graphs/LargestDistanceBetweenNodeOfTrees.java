package src.graphs;

import java.util.ArrayList;
import java.util.List;

public class LargestDistanceBetweenNodeOfTrees {

    public static void main(String[] args) {
        System.out.println(solve(new int[]{-1, 0}));
        System.out.println(solve(new int[]{-1, 0, 0}));
    }

    static int diameter = 0;
    public static int solve(int[] A) {
        // create graph
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i=0; i<A.length; i++) {
            adjList.add(new ArrayList<>());
        }
        int root = 0;
        for(int i=0; i<A.length; i++) {
            if(A[i] == -1) {
                root = i; continue;
            }
            adjList.get(A[i]).add(i);
            adjList.get(i).add(A[i]);
        }

        // apply dfs
        int[] visited = new int[A.length];
        visited[root] = 1;
        dfs(adjList, visited, root);
        return diameter;
    }


    public static int dfs(List<List<Integer>> adjList, int[] visited, int node) {
        int firstMax = 0;
        int secondMax = 0;
        for(int val: adjList.get(node)) {
            if(visited[val] == 0) {
                visited[node] = 1;
                int temp = dfs(adjList, visited, val);
                secondMax = Integer.max(Integer.min(firstMax, temp), secondMax);
                firstMax = Integer.max(firstMax, temp);
            }
        }
        diameter = Integer.max(diameter, firstMax + secondMax);
        return 1 + Integer.max(firstMax, secondMax);
    }

}
