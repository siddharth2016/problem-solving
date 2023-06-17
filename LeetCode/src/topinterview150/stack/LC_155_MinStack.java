package src.topinterview150.stack;

import java.util.Stack;

public class LC_155_MinStack {

    static class MinStack {

        private final Stack<Integer> mainStack;
        private final Stack<Integer> minStack;

        public MinStack() {
            mainStack = new Stack<>();
            minStack = new Stack<>();
        }

        public void push(int val) {
            mainStack.push(val);
            if (minStack.isEmpty()) minStack.push(val);
            else if (minStack.peek() > val) minStack.push(val);
            else minStack.push(minStack.peek());
        }

        public void pop() {
            mainStack.pop();
            minStack.pop();
        }

        public int top() {
            return mainStack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }
    }
}
