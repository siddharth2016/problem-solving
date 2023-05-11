package src.graphs;

import java.util.ArrayList;
import java.util.Scanner;

public class AdjacencyListGraph {

    static class Graph {

        private int v;
        private int e;
        private ArrayList<ArrayList<Integer>> adjList;

        public Graph(int v, int e) {
            this.v = v;
            this.e = e;
            adjList = new ArrayList<>();

            for(int i=0; i<v; i++) {
                adjList.add(new ArrayList<>());
            }
        }

        public void addEdge(int node1, int node2) {
            adjList.get(node1).add(node2);
            adjList.get(node2).add(node1);
        }

        public void printGraph() {
            System.out.println(adjList);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int v = scan.nextInt();
        int e = scan.nextInt(); scan.nextLine();
        Graph g = new Graph(v, e);
        for(int i=0; i<e; i++) {
            int n1 = scan.nextInt();
            int n2 = scan.nextInt();
            g.addEdge(n1, n2);
        }
        g.printGraph();
    }

}
