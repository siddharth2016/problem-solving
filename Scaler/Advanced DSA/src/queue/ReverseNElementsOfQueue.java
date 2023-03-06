package src.queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class ReverseNElementsOfQueue {

    public int[] solve(int[] A, int B) {
        Deque<Integer> dq = new LinkedList<>();
        for(int val: A) {
            dq.addLast(val);
        }

        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<B; i++) {
            stack.push(dq.removeFirst());
        }

        while(!stack.isEmpty()) {
            dq.addLast(stack.pop());
        }

        for(int i=B; i<A.length; i++) {
            dq.addLast(dq.removeFirst());
        }

        int[] result = new int[A.length];
        int i = 0;
        while(dq.size() != 0) {
            result[i++] = dq.removeFirst();
        }

        return result;
    }

}
