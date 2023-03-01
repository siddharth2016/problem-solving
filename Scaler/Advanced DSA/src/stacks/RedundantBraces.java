package src.stacks;

import java.util.Stack;

public class RedundantBraces {

    public int braces(String A) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for(Character chr: A.toCharArray()) {
            if(chr == ')') {
                while(stack.peek() != '(') {
                    stack.pop();
                    count++;
                }
                stack.pop();
                if(count <= 1) return 1;
                count = 0;
            }
            else stack.push(chr);
        }
        return 0;
    }

}
