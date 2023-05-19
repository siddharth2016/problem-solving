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

    static class Pair {
        int node;
        int dist;
        public Pair(int n, int d) {
            node = n;
            dist = d;
        }
    }

    public static int reverseEdges(int A, int[][] B) {
        // construct an undirected graph with weights 0 and 1;
        List<List<Pair>> adjList = new ArrayList<>();
        for(int i=0; i<=A; i++) {
            adjList.add(new ArrayList<>());
        }
        for(int[] edge: B) {
            adjList.get(edge[0]).add(new Pair(edge[1], 0));
            adjList.get(edge[1]).add(new Pair(edge[0], 1));
        }

        // applying dijkstra's to find shorted path
        int[] visited = new int[A+1];
        Arrays.fill(visited, -1);
        PriorityQueue<Pair> queue = new PriorityQueue<>(
                Comparator.comparing(p -> p.dist)
        );
        visited[1] = 0;
        queue.offer(new Pair(1, 0));
        while(!queue.isEmpty()) {
            Pair pair = queue.poll();
            for(Pair temp: adjList.get(pair.node)) {
                if(visited[temp.node] == -1) {
                    visited[temp.node] = visited[pair.node] + temp.dist;
                    queue.offer(new Pair(temp.node, visited[temp.node]));
                }
                else if(visited[temp.node] > visited[pair.node] + temp.dist) {
                    visited[temp.node] = visited[pair.node] + temp.dist;
                    queue.offer(new Pair(temp.node, visited[temp.node]));
                }
            }
        }
        return visited[A];
    }

}
