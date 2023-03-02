package src.stacks;

import java.util.Stack;

public class InfixToPostfix {

    public int precedence(char ch) {
        if(ch == '+' || ch == '-') return 1;
        if(ch == '*' || ch == '/') return 2;
        if(ch == '^') return 3;
        return -1;
    }
    public String solve(String A) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(Character ch: A.toCharArray()) {
            if(Character.isLetterOrDigit(ch)) result.append(ch);
            else if(ch == '(') stack.push(ch);
            else if(ch == ')') {
                while(!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop();
            }
            else {
                while(!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(ch);
            }
        }
        while(!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.toString();
    }
}
