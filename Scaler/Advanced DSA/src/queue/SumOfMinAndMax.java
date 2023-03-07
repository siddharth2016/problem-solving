package src.queue;

import java.util.Deque;
import java.util.LinkedList;

public class SumOfMinAndMax {

    public int solve(int[] A, int B) {
        Deque<Integer> maxDq = new LinkedList<>();
        Deque<Integer> minDq = new LinkedList<>();
        int[] maxResult = new int[A.length - B + 1];
        int[] minResult = new int[A.length - B + 1];
        for(int i=0; i<B; i++) {
            while(maxDq.size() != 0 && A[maxDq.peekLast()]  <= A[i]) {
                maxDq.removeLast();
            }
            maxDq.addLast(i);

            while(minDq.size() != 0 && A[minDq.peekLast()] >= A[i]) {
                minDq.removeLast();
            }
            minDq.addLast(i);
        }
        int j = 1;
        maxResult[0] = A[maxDq.peekFirst()];
        minResult[0] = A[minDq.peekFirst()];

        for(int i=B; i<A.length; i++) {
            while(maxDq.size() != 0 && maxDq.peekFirst() <= i - B) {
                maxDq.removeFirst();
            }
            while(minDq.size() != 0 && minDq.peekFirst() <= i - B) {
                minDq.removeFirst();
            }

            while(maxDq.size() != 0 && A[maxDq.peekLast()] <= A[i]) {
                maxDq.removeLast();
            }
            while(minDq.size() != 0 && A[minDq.peekLast()] >= A[i]) {
                minDq.removeLast();
            }

            maxDq.addLast(i);
            minDq.addLast(i);

            maxResult[j] = A[maxDq.peekFirst()];
            minResult[j] = A[minDq.peekFirst()];
            j++;
        }

        long result = 0l;
        int mod = (int)Math.pow(10, 9) + 7;
        for(int i=0; i<A.length - B + 1; i++) {
            result = (result % mod + 1l*maxResult[i] % mod + mod) % mod;
            result = (result % mod + 1l*minResult[i] % mod + mod) % mod;
        }
        return (int)result;
    }

}
