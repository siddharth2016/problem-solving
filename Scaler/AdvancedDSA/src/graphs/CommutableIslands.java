package src.graphs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class CommutableIslands {

    class Pair {
        int node;
        int cost;
        public Pair(int n, int c) {
            node = n;
            cost = c;
        }
    }

    public int solve(int A, int[][] B) {
        // create graph adjList
        List<List<Pair>> adjList = new ArrayList<>();
        for(int i=0; i<=A; i++) {
            adjList.add(new ArrayList<>());
        }
        for(int[] edge: B) {
            adjList.get(edge[0]).add(new Pair(edge[1], edge[2]));
            adjList.get(edge[1]).add(new Pair(edge[0], edge[2]));
        }

        // create visited, priority queue and ans
        int[] visited = new int[A+1];
        PriorityQueue<Pair> queue = new PriorityQueue<>(Comparator.comparing(p -> p.cost));
        int ans = 0;
        queue.offer(new Pair(1, 0));

        // start prims algo
        while(!queue.isEmpty()) {
            Pair pair = queue.poll();
            int nodeVal = pair.node;
            int costVal = pair.cost;
            if(visited[nodeVal] == 0) {
                ans += costVal;
                for(Pair nbr: adjList.get(nodeVal)) {
                    if(visited[nbr.node] == 0) queue.add(new Pair(nbr.node, nbr.cost));
                }
                visited[nodeVal] = 1;
            }
        }
        return ans;
    }

}
