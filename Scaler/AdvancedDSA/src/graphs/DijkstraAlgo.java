package src.graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class DijkstraAlgo {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(
                5,
                new int[][]{
                        {0, 3, 4},
                        {2, 3, 3},
                        {0, 1, 9},
                        {3, 4, 10},
                        {1, 3, 8}
                },
                4
        )));
    }

    static class Pair {
        int node;
        int dist;
        public Pair(int n, int d) {
            node = n;
            dist = d;
        }
    }

    public static int[] solve(int A, int[][] B, int C) {
        // construct a graph
        List<List<Pair>> adjList = new ArrayList<>();
        for(int i=0; i<A; i++) {
            adjList.add(new ArrayList<>());
        }
        for(int[] edge: B) {
            adjList.get(edge[0]).add(new Pair(edge[1], edge[2]));
            adjList.get(edge[1]).add(new Pair(edge[0], edge[2]));
        }

        // dijkstra's using priority queue, can be done using TreeSet as well
        int[] visited = new int[A];
        Arrays.fill(visited, -1);
        PriorityQueue<Pair> queue = new PriorityQueue<>(
                (p1, p2) -> Integer.compare(p1.dist, p2.dist)
        );
        visited[C] = 0;
        queue.offer(new Pair(C, 0));
        while(!queue.isEmpty()) {
            Pair pair = queue.poll();
            for(Pair val: adjList.get(pair.node)) {
                if(visited[val.node] == -1) {
                    visited[val.node] = visited[pair.node] + val.dist;
                    queue.offer(new Pair(val.node, visited[val.node]));
                }
                else if(visited[val.node] > visited[pair.node] + val.dist) {
                    visited[val.node] = visited[pair.node] + val.dist;
                    queue.offer(new Pair(val.node, visited[val.node]));
                }
            }
        }
        return visited;
    }

}
