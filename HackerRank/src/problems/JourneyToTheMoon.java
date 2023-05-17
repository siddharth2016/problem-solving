package src.problems;

import java.util.*;

public class JourneyToTheMoon {

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

    public static long journeyToMoon(int n, List<List<Integer>> astronaut) {
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
        long secondPart = 0L;
        for(int i=0; i<n; i++) {
            int count = 0;
            if(traversed[i] == -1) {
                count = bfs(adjList, traversed, i);
                secondPart += ((long)count * (long)(count-1)) / 2L;
            }
        }
        long firstPart = ((long)n * (long)(n-1)) / 2;
        return firstPart - secondPart;
    }

    public static int bfs(List<List<Integer>> adjList, int[] traversed, int node) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);
        int count = 1;
        traversed[node] = 1;
        while(!queue.isEmpty()) {
            int first = queue.poll();
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
