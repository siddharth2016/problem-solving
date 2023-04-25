package src.stacks;

import java.util.Stack;

public class DoubleCharacterTrouble {

    public String solve(String A) {
        Stack<Character> stack = new Stack<>();

        for(Character chr: A.toCharArray()) {
            if(stack.isEmpty() || stack.peek() != chr) {
                stack.push(chr);
            }
            else {
                stack.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        sb.reverse();
        return sb.toString();
    }

}
