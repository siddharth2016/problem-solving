package src.problems;

import java.util.*;

public class TempSolution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int e = scan.nextInt(); scan.nextLine();
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0; i<e; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(scan.nextInt());
            temp.add(scan.nextInt());
            scan.nextLine();
            list.add(temp);
        }
        System.out.println(journeyToMoon(n, list));
    }

    public static int journeyToMoon(int n, List<List<Integer>> astronaut) {
        // Write your code here
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i=0; i<n; i++) {
            adjList.add(new ArrayList<>());
        }
        for(List<Integer> list: astronaut) {
            adjList.get(list.get(0)).add(list.get(1));
            adjList.get(list.get(1)).add(list.get(0));
        }
        int[] traversed = new int[n];
        Arrays.fill(traversed, -1);
        System.out.println(adjList);
        List<Long> sets = new ArrayList<>();
        for(int i=0; i<n; i++) {
            long count = 0L;
            if(traversed[i] == -1) {
                count = bfs(adjList, traversed, i);
                sets.add(count);
            }
        }
        long ans = 0L;
        long covered = 0L;
        System.out.println(sets);
        for(long val: sets) {
            ans += val * ((long)n - val - covered);
            covered += val;
        }
        return (int) ans;
    }

    public static long bfs(List<List<Integer>> adjList, int[] traversed, int node) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);
        long count = 1L;
        while(!queue.isEmpty()) {
            int first = queue.poll();
            traversed[first] = 1;
            for(int val: adjList.get(first)) {
                if(traversed[val] == -1) {
                    queue.add(val);
                    count++;
                    traversed[val] = 1;
                }
            }
        }
        return count;
    }

}
