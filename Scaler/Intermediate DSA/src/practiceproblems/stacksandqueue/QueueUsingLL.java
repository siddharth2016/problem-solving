package practiceproblems.stacksandqueue;


public class QueueUsingLL {

    Node head;
    Node tail;

    QueueUsingLL() {
        head = null;
        tail = null;
    }

    void push(int data) {
        Node newNode = new Node(data);
        if(head==null) {
            head = newNode;
        }
        else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    void pop() {
        if(head != null) head = head.next;
    }

    int getFront() {
        if(head!=null) return head.data;
        return -1;
    }

}
