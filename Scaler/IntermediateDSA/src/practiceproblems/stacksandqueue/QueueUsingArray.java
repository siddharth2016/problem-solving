package practiceproblems.stacksandqueue;

public class QueueUsingArray {

    int[] arr;
    int front;
    int rear;
    int length;
    int capacity;

    QueueUsingArray(int cap) {
        capacity = cap;
        arr = new int[cap];
        front = 0;
        rear = 0;
        length = 0;
    }

    void push(int data) {
        if(length != capacity) {
            arr[rear] = data;
            rear = (rear + 1)%capacity;
            length++;
        }
    }

    void pop() {
        if(length!=0) {
            front = (front+1)%capacity;
            length--;
        }
    }

    int getFront() {
        if(length!=0) return arr[front];
        return -1;
    }
}
