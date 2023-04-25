package src.queue;

import java.util.Deque;
import java.util.LinkedList;

public class TaskScheduling {

    public int solve(int[] A, int[] B) {
        Deque<Integer> dq = new LinkedList<>();
        for(int val: A) {
            dq.addLast(val);
        }
        int i = 0;
        int result = 0;

        while(i < B.length) {
            int front = dq.peekFirst();
            if(B[i] == front) {
                i++;
            }
            else {
                dq.addLast(front);
            }
            dq.removeFirst();
            result++;
        }

        return result;
    }

}
