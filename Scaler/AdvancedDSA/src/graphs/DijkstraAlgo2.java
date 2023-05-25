package src.graphs;

import java.util.*;

public class DijkstraAlgo2 {

    class Pair {
        int node;
        int cost;
        public Pair(int n, int c) {
            node = n;
            cost = c;
        }
    }

    public int[] solve(int A, int[][] B, int C) {
        // create graph
        List<List<Pair>> adjList = new ArrayList<>();
        for(int i=0; i<A; i++) {
            adjList.add(new ArrayList<>());
        }
        for(int[] edge: B) {
            adjList.get(edge[0]).add(new Pair(edge[1], edge[2]));
            adjList.get(edge[1]).add(new Pair(edge[0], edge[2]));
        }

        int[] visited = new int[A];
        Arrays.fill(visited, -1);
        PriorityQueue<Pair> queue = new PriorityQueue<>(Comparator.comparing(p -> p.cost));
        queue.offer(new Pair(C, 0));
        visited[C] = 0;
        while(!queue.isEmpty()) {
            Pair pair = queue.poll();
            int node = pair.node;
            int cost = pair.cost;
            for(Pair temp: adjList.get(node)) {
                if(visited[temp.node] == -1) {
                    visited[temp.node] = visited[node] + temp.cost;
                    queue.offer(new Pair(temp.node, visited[temp.node]));
                }
                else if(visited[temp.node] > visited[node] + temp.cost) {
                    visited[temp.node] = visited[node] + temp.cost;
                    queue.offer(new Pair(temp.node, visited[temp.node]));
                }
            }
        }
        return visited;
    }

}
