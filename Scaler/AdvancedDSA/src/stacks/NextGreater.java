package src.stacks;

import java.util.Stack;

public class NextGreater {

    public int[] nextGreater(int[] A) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[A.length];
        for(int i=A.length-1; i>=0; i--) {
            while(!stack.isEmpty() && stack.peek() <= A[i]) {
                stack.pop();
            }
            if(stack.isEmpty()) result[i] = -1;
            else result[i] = stack.peek();
            stack.push(A[i]);
        }
        return result;
    }

}
