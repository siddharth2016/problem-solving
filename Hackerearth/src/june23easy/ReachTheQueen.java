package src.june23easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReachTheQueen {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nodes = scan.nextInt();
        int m = scan.nextInt();
        int[][] edges = new int[m][2];
        for(int i=0; i<m; i++) {
            edges[i][0] = scan.nextInt();
            edges[i][1] = scan.nextInt();
        }
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i=0; i<=nodes; i++) {
            adjList.add(new ArrayList<>());
        }
        for(int[] edge: edges) {
            adjList.get(edge[0]).add(edge[1]);
        }

        long[] visited = new long[nodes+1];
        Arrays.fill(visited, -1L);
        dfs(adjList, visited, 1, (int)Math.pow(10, 9)+7);
        System.out.println(visited[nodes]);
    }

    public static void dfs(List<List<Integer>> adjList, long[] visited, int node, int mod) {
        visited[node] = (visited[node] + 1) % mod;
        for(int val: adjList.get(node)) {
            dfs(adjList, visited, val, mod);
        }
    }

}
