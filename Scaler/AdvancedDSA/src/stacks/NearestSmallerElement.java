package src.stacks;

import java.util.Stack;

public class NearestSmallerElement {
    public int[] prevSmaller(int[] A) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[A.length];
        for(int i=0; i<A.length; i++) {
            while(!stack.isEmpty() && stack.peek() >= A[i]) {
                stack.pop();
            }
            if(stack.isEmpty()) result[i] = -1;
            else result[i] = stack.peek();
            stack.push(A[i]);
        }
        return result;
    }

}
