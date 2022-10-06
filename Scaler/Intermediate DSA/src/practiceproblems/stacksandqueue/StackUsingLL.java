package practiceproblems.stacksandqueue;


class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class StackUsingLL {

    Node head;

    StackUsingLL() {
        head = null;
    }

    void push(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    void pop() {
        if(head != null) head = head.next;
    }

    int top() {
        if(head != null) return head.data;
        return -1;
    }

}
