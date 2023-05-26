package src.graphs;

import java.util.*;

public class MaximumDepth {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(5, new int[]{1, 4, 3, 1}, new int[]{5, 2, 4, 4}, new int[]{7, 38, 27, 37, 1},
                new int[]{1, 1, 2}, new int[]{32, 18, 26})));

        System.out.println(Arrays.toString(solve(3, new int[]{1, 2}, new int[]{3, 1}, new int[]{7, 15, 27},
                new int[]{1, 10, 1}, new int[]{29, 6, 26})));
    }

    public static int[] solve(int A, int[] B, int[] C, int[] D, int[] E, int[] F) {
        // create graph
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i=0; i<=A; i++) {
            adjList.add(new ArrayList<>());
        }
        for(int i=0; i<B.length; i++) {
            adjList.get(B[i]).add(C[i]);
            adjList.get(C[i]).add(B[i]);
        }

        // create level wise node's weight list
        int[] visited = new int[A + 1];
        List<List<Integer>> levels = createLevelWiseNodeList(adjList, D, visited);

        // sort levels
        for(List<Integer> list: levels) {
            Collections.sort(list);
        }

        int totalLevels = levels.size();

        // sanitize E, list of given levels
        for(int i=0; i<E.length; i++) {
            E[i] = E[i] % totalLevels;
        }

        int[] result = new int[E.length];

        for(int i=0; i<E.length; i++) {
            result[i] = binarySearch(levels.get(E[i]), F[i]);
        }

        return result;
    }

    public static int binarySearch(List<Integer> arr, int k) {
        int ans = -1;
        int start = 0;
        int end = arr.size()-1;
        while(start <= end) {
            int mid = start + (end-start)/2;
            if(arr.get(mid) >= k) {
                ans = arr.get(mid);
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static List<List<Integer>> createLevelWiseNodeList(List<List<Integer>> adjList, int[] weights, int[] visited) {
        List<List<Integer>> levels = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> temp = new ArrayList<>();
        queue.add(1);
        queue.add(null);
        while(!queue.isEmpty()) {
            Integer val = queue.poll();
            if(val == null) {
                levels.add(temp);
                temp = new ArrayList<>();
                if(queue.isEmpty()) break;
                queue.add(null);
            }
            else {
                temp.add(weights[val-1]);
                visited[val] = 1;
                for(int node: adjList.get(val)) {
                    if(visited[node] == 0) queue.add(node);
                }
            }
        }
        return levels;
    }

}
