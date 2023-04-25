package src.stacks;

import java.util.Stack;

public class EvaluateExpressions {

    public int evalRPN(String[] A) {

        Stack<Integer> stack = new Stack<>();

        for(String exp: A) {
            if("*".equals(exp)) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a * b);
            }
            else if("+".equals(exp)){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a + b);
            }
            else if("-".equals(exp)){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a - b);
            }
            else if("/".equals(exp)) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a / b);
            }
            else {
                stack.push(Integer.parseInt(exp));
            }
        }

        return stack.pop();
    }

}
