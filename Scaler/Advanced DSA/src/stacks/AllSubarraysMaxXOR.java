package src.stacks;

import java.util.Stack;

public class AllSubarraysMaxXOR {

    public int solve(int[] A) {
        Stack<Integer> stack = new Stack<>();
        int result = Integer.MIN_VALUE;
        for(int val: A) {
            while(!stack.isEmpty() && stack.peek() <= val) {
                result = Integer.max(result, val ^ stack.pop());
            }

            if(!stack.isEmpty()) result = Integer.max(result, val ^ stack.peek());

            stack.push(val);
        }
        return result;
    }

}
