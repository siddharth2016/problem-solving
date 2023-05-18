package src.graphs;

import java.util.*;

public class ReversingEdges {

    public static void main(String[] args) {
        System.out.println(reverseEdges(
                6,
                new int[][] {
                        {1,2},
                        {2,3},
                        {3,4},
                        {4,1},
                        {2,3},
                        {4,2},
                        {3,4},
                        {5,5},
                        {5,5}
                }
        ));
    }

    public static int reverseEdges(int A, int[][] B) {
        // created un-directed adjList
        List<Set<Integer>> adjList1 = new ArrayList<>();
        for(int i=0; i<=A; i++) {
            adjList1.add(new HashSet<>());
        }
        for(int[] edge: B) {
            adjList1.get(edge[0]).add(edge[1]);
            adjList1.get(edge[1]).add(edge[0]);
        }

        // find shortest path from 1 to A
        int[] visited = new int[A+1];
        int[] parent = new int[A+1];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        Arrays.fill(parent, -1);
        visited[1] = 1;
        while(!queue.isEmpty()) {
            int first = queue.poll();
            for(int val: adjList1.get(first)) {
                if(visited[val] == 0) {
                    visited[val] = 1;
                    parent[val] = first;
                    queue.add(val);
                }
            }
        }

        if(parent[A] == -1) return -1;

        // create adjList for direct graph
        List<Set<Integer>> adjList2 = new ArrayList<>();
        for(int i=0; i<=A; i++) {
            adjList2.add(new HashSet<>());
        }
        for(int[] edge: B) {
            adjList2.get(edge[0]).add(edge[1]);
        }

        // path from A to 1, check in directed graph, if for any edge path is not present increase count by 1
        int node = A;
        int count = 0;
        while(node != -1) {
            int curr = node;
            int prev = parent[curr];
            if(prev != -1 && !adjList2.get(prev).contains(curr)) count++;
            node = prev;
        }

        return count;
    }

}
