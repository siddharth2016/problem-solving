package src.graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class TopologicalSorting {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(
                6,
                new int[][]{
                        {6, 3},
                        {3, 4},
                        {4, 2},
                        {5, 2},
                        {5, 1}
                }
        )));
    }

    public static int[] solve(int A, int[][] B) {

        // construct graph and in-degree array
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i=0; i<=A; i++) {
            adjList.add(new ArrayList<>());
        }
        int[] inDeg = new int[A+1];
        for(int[] edge: B) {
            inDeg[edge[1]]++;
            adjList.get(edge[0]).add(edge[1]);
        }

        // if cycle is present return empty array;
        int[] visited = new int[A+1];
        int[] stack = new int[A+1];
        boolean possible = true;
        for(int i=1; i<=A; i++) {
            if(visited[i] == 0) possible = possible && dfsCycle(adjList, visited, stack, i);
        }
        if(!possible) return new int[]{};

        // if possible then find the topological sort
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i=1; i<=A; i++) {
            int val = inDeg[i];
            if(val == 0) {
                queue.add(i);
            }
        }
        int k = 0;
        int[] result = new int[A];
        while(!queue.isEmpty()) {
            int first = queue.poll();
            for(int val: adjList.get(first)) {
                inDeg[val]--;
                if(inDeg[val] == 0) queue.add(val);
            }
            result[k++] = first;
        }
        return result;
    }

    public static boolean dfsCycle(List<List<Integer>> adjList, int[] visited, int[] stack, int node) {
        if(visited[node] == 1 && stack[node] == 1) return false;
        if(visited[node] == 1 && stack[node] == 0) return true;
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
