package src.greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class FreeCars {

    class Pair {
        int deadline;
        int profit;

        public Pair(int d, int p) {
            deadline = d;
            profit = p;
        }
    }

    public int solve(int[] A, int[] B) {
        Pair[] arr = new Pair[A.length];
        for(int i=0; i<A.length; i++) {
            arr[i] = new Pair(A[i], B[i]);
        }
        Arrays.sort(arr, Comparator.comparingInt(p -> p.deadline));
        PriorityQueue<Pair> minHeap = new PriorityQueue<>(
                Comparator.comparingInt(p -> p.profit)
        );
        int time = 0;
        long ans = 0l;
        int mod = (int)Math.pow(10, 9) + 7;
        for(Pair p: arr) {
            if(time < p.deadline) {
                time++;
                ans = (ans % mod + p.profit % mod) % mod;
                minHeap.add(p);
            }
            else if(minHeap.size() != 0 && minHeap.peek().profit < p.profit) {
                int tempProfit = minHeap.poll().profit;
                minHeap.add(p);
                ans = (ans % mod + p.profit % mod - tempProfit + mod) % mod;
            }
        }
        return (int)ans;
    }

}
