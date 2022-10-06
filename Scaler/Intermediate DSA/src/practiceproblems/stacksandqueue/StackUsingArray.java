package practiceproblems.stacksandqueue;

public class StackUsingArray {

    int[] array;
    int capacity;
    int top;

    StackUsingArray(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
        this.top = -1;
    }

    void push(int data) {
        if(this.top != this.capacity) {
            this.top++;
            this.array[this.top] = data;
        }
    }

    void pop() {
        if(!isEmpty()) {
            this.top--;
        }
    }

    int top() {
        return this.top;
    }

    boolean isEmpty() {
        return this.top == -1;
    }
}
