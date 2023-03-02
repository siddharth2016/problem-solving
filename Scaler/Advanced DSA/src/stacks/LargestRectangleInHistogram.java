package src.stacks;

import java.util.Stack;

public class LargestRectangleInHistogram {

    public int[] getSmallerLeft(int[] A) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[A.length];
        for(int i=0; i<A.length; i++) {
            while(!stack.isEmpty() && A[stack.peek()] >= A[i]) {
                stack.pop();
            }
            if(stack.isEmpty()) result[i] = -1;
            else result[i] = stack.peek();
            stack.push(i);
        }
        return result;
    }

    public int[] getSmallerRight(int[] A) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[A.length];
        for(int i=A.length-1; i>=0; i--) {
            while(!stack.isEmpty() && A[stack.peek()] >= A[i]) {
                stack.pop();
            }
            if(stack.isEmpty()) result[i] = A.length;
            else result[i] = stack.peek();
            stack.push(i);
        }
        return result;
    }

    public int largestRectangleArea(int[] A) {

        int[] smallerLeft = getSmallerLeft(A);
        int[] smallerRight = getSmallerRight(A);

        int result = 0;

        for(int i=0; i<A.length; i++) {
            result = Integer.max(result, A[i] * (smallerRight[i] - smallerLeft[i] - 1));
        }

        return result;
    }

}
