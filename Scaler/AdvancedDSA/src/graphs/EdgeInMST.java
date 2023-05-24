package src.graphs;

import java.util.*;

public class EdgeInMST {

    class DSU {
        public int[] parent;
        public int n;

        public DSU(int n) {
            parent = new int[n+1];
            Arrays.fill(parent, -1);
        }

        public int find(int val) {
            if(parent[val] == -1) return val;
            return find(parent[val]);
        }

        public void union(int set1, int set2) {
            if(set1 != set2) {
                parent[Integer.max(set1, set2)] = Integer.min(set1, set2);
            }
        }
    }

    class Edge {
        int node1;
        int node2;
        int weight;
        int index;
        public Edge(int n1, int n2, int w, int i) {
            node1 = n1;
            node2 = n2;
            weight = w;
            index = i;
        }
    }

    public int[] solve(int A, int[][] B) {
        List<Edge> edgeList = new ArrayList<>();
        for(int i=0; i<B.length; i++) {
            int[] edge = B[i];
            edgeList.add(new Edge(edge[0], edge[1], edge[2], i));
        }
        edgeList.sort(Comparator.comparing(e -> e.weight));
        int[] result = new int[B.length];
        DSU dsu = new DSU(A);
        int i = 0;
        while(i < B.length) {
            int j = i;
            while(j < B.length && edgeList.get(i).weight == edgeList.get(j).weight) {
                int parent1 = dsu.find(edgeList.get(j).node1);
                int parent2 = dsu.find(edgeList.get(j).node2);
                if(parent1 != parent2) {
                    result[edgeList.get(j).index] = 1;
                }
                j++;
            }
            j = i;
            while(j < B.length && edgeList.get(i).weight == edgeList.get(j).weight) {
                int parent1 = dsu.find(edgeList.get(j).node1);
                int parent2 = dsu.find(edgeList.get(j).node2);
                if(parent1 != parent2) {
                    dsu.union(parent1, parent2);
                }
                j++;
            }
            i = j;
        }
        return result;
    }
}
