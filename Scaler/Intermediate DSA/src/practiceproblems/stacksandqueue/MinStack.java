package practiceproblems.stacksandqueue;

public class MinStack {

    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    Node head1;
    Node head2;

    public void push(int x) {
        Node newNode = new Node(x);
        Node newNode2 = new Node(x);
        if(head1 == null) {
            head1 = newNode;
            head2 = newNode2;
        }
        else {
            newNode.next = head1;
            head1 = newNode;

            if(head2.data > x) {
                newNode2.next = head2;
                head2 = newNode2;
            }
            else {
                Node temp = new Node(head2.data);
                temp.next = head2;
                head2 = temp;
            }
        }
    }

    public void pop() {
        if(head1 != null) {
            head1 = head1.next;
            head2 = head2.next;
        }
    }

    public int top() {
        if(head1 != null) return head1.data;
        else return -1;
    }

    public int getMin() {
        if(head2 != null) return head2.data;
        else return -1;
    }

}
