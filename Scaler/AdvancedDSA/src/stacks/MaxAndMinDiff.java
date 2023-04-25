package src.stacks;

import java.util.Stack;

public class MaxAndMinDiff {

    public int[] getMinLeft(int[] A) {
        int[] result = new int[A.length];
        Stack<Integer> stack = new Stack<>();
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

    public int[] getMinRight(int[] A) {
        int[] result = new int[A.length];
        Stack<Integer> stack = new Stack<>();
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

    public int[] getMaxLeft(int[] A) {
        int[] result = new int[A.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<A.length; i++) {
            while(!stack.isEmpty() && A[stack.peek()] <= A[i]) {
                stack.pop();
            }
            if(stack.isEmpty()) result[i] = -1;
            else result[i] = stack.peek();
            stack.push(i);
        }
        return result;
    }

    public int[] getMaxRight(int[] A) {
        int[] result = new int[A.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=A.length-1; i>=0; i--) {
            while(!stack.isEmpty() && A[stack.peek()] <= A[i]) {
                stack.pop();
            }
            if(stack.isEmpty()) result[i] = A.length;
            else result[i] = stack.peek();
            stack.push(i);
        }
        return result;
    }


    public int solve(int[] A) {
        int[] minLeft = getMinLeft(A);
        int[] minRight = getMinRight(A);
        int[] maxLeft = getMaxLeft(A);
        int[] maxRight = getMaxRight(A);

        long maxValue = 0;
        long minValue = 0;
        int mod = (int)Math.pow(10, 9) + 7;

        for(int i=0; i<A.length; i++) {
            minValue = (((long)A[i] * ((long)(i - minLeft[i]) * (long)(minRight[i] - i))) % mod + minValue % mod) % mod;
            maxValue = ((A[i] * ((long) (i - maxLeft[i]) * (maxRight[i] - i))) % mod + maxValue % mod) % mod;
        }

        return (int)(maxValue - minValue + mod) % mod;
    }

}
