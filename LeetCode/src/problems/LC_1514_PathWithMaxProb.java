package src.problems;

import java.util.*;

public class LC_1514_PathWithMaxProb {

    class Pair {
        double prob;
        int node;
        public Pair(double p, int n) {
            prob = p;
            node = n;
        }
    }

    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        List<List<Pair>> adjList = new ArrayList<>();
        for(int i=0; i<n; i++) {
            adjList.add(new ArrayList<>());
        }
        for(int i=0; i<edges.length; i++) {
            adjList.get(edges[i][0]).add(new Pair(succProb[i], edges[i][1]));
            adjList.get(edges[i][1]).add(new Pair(succProb[i], edges[i][0]));
        }
        double[] traversed = new double[n];
        Arrays.fill(traversed, 0);
        PriorityQueue<Pair> queue = new PriorityQueue<>(
                (p1, p2) -> {
                    return Double.compare(p2.prob, p1.prob);
                }
        );
        queue.offer(new Pair(1, start));
        traversed[start] = 1;
        while(!queue.isEmpty()) {
            Pair p = queue.poll();
            for(Pair temp: adjList.get(p.node)) {
                if(traversed[temp.node] == 0) {
                    traversed[temp.node] = traversed[p.node] * temp.prob;
                    queue.offer(new Pair(traversed[temp.node], temp.node));
                }
                else if(traversed[temp.node] < (traversed[p.node] * temp.prob)) {
                    traversed[temp.node] = traversed[p.node] * temp.prob;
                    queue.offer(new Pair(traversed[temp.node], temp.node));
                }
            }
        }
        return traversed[end];
    }
}
