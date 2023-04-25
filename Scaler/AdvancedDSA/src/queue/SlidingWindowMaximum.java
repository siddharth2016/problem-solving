package src.queue;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {

    public int[] slidingMaximum(final int[] A, int B) {
        Deque<Integer> dq = new LinkedList<>();
        for(int i=0; i<B && i<A.length; i++) {
            while(dq.size() != 0 && A[dq.peekLast()] <= A[i]) {
                dq.removeLast();
            }
            dq.addLast(i);
        }
        if(A.length < B) {
            return new int[]{A[dq.peekFirst()]};
        }

        int[] result = new int[A.length - B + 1];
        int j = 0;
        result[j++] = A[dq.peekFirst()];
        for(int i=B; i<A.length; i++) {
            while(dq.size() != 0 && dq.peekFirst() <= i - B) {
                dq.removeFirst();
            }
            while(dq.size() != 0 && A[dq.peekLast()] <= A[i]) {
                dq.removeLast();
            }
            dq.addLast(i);
            result[j++] = A[dq.peekFirst()];
        }
        return result;
    }

}
