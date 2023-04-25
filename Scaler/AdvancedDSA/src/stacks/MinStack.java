package src.stacks;

import java.util.Stack;

public class MinStack {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void push(int x) {
        stack1.push(x);
        if(!stack2.isEmpty() && stack2.peek() <= x) stack2.push(stack2.peek());
        else stack2.push(x);
    }

    public void pop() {
        if(!stack1.isEmpty() && !stack2.isEmpty()) {
            stack1.pop();
            stack2.pop();
        }
    }

    public int top() {
        if(!stack1.isEmpty()) return stack1.peek();
        else return -1;
    }

    public int getMin() {
        if(!stack2.isEmpty()) return stack2.peek();
        else return -1;
    }

}
