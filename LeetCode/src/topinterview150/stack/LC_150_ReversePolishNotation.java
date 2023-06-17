package src.topinterview150.stack;

import java.util.Stack;

public class LC_150_ReversePolishNotation {

    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for(String op: tokens) {
            if("+".equals(op)) {
                int b = Integer.parseInt(stack.pop());
                int a = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(a+b));
            }
            else if("-".equals(op)) {
                int b = Integer.parseInt(stack.pop());
                int a = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(a-b));
            }
            else if("*".equals(op)) {
                int b = Integer.parseInt(stack.pop());
                int a = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(a*b));
            }
            else if("/".equals(op)) {
                int b = Integer.parseInt(stack.pop());
                int a = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(a/b));
            }
            else stack.push(op);
        }
        return Integer.parseInt(stack.pop());
    }

}
