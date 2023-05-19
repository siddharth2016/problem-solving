package src.graphs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class ConstructionCost {

    class Pair {
        int val;
        int cost;
        public Pair(int v, int c) {
            val = v;
            cost = c;
        }
    }

    public int solve(int A, int[][] B) {
        // create the graph
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
        long ans = 0L;
        int mod = (int)Math.pow(10, 9) + 7;
        queue.offer(new Pair(1, 0));

        // start prims algo
        while(!queue.isEmpty()) {
            Pair pair = queue.poll();
            int nodeVal = pair.val;
            int costVal = pair.cost;
            if(visited[nodeVal] == 0) {
                ans = (ans % mod + costVal % mod) % mod;
                for(Pair nbr: adjList.get(nodeVal)) {
                    if(visited[nbr.val] == 0) queue.offer(new Pair(nbr.val, nbr.cost));
                }
                visited[nodeVal] = 1;
            }
        }

        return (int)ans;
    }

}
