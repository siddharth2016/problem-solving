package practiceproblems.linkedlist;

public class LinkedList {


    public static class Node {
        public int value;
        public Node next;

        public Node(int v) {
            value = v;
            next = null;
        }
    }

    public static Node head = null;
    public static int lengthOfList = 0;

    public static void insert_node(int position, int value) {
        // @params position, integer
        // @params value, integer
        if(position > lengthOfList + 1) return;
        if(head == null) {
            head = new Node(value);
        }
        else if(position == 1) {
            Node temp = new Node(value);
            temp.next = head;
            head = temp;
        }
        else {
            Node temp = head;
            for(int i=1; i<position-1; i++) {
                temp = temp.next;
            }
            Node newNode = new Node(value);
            newNode.next = temp.next;
            temp.next = newNode;
        }
        lengthOfList++;
    }

    public static void delete_node(int position) {
        // @params position, integer
        if(position > lengthOfList) return;
        if(position == 1) head = head.next;
        else {
            Node temp = head;
            for(int i=1; i<position-1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        lengthOfList--;
    }

    public static void print_ll() {
        // Output each element followed by a space
        if(lengthOfList == 0) return;

        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.value);
            temp = temp.next;
            if(temp!=null) System.out.print(" ");
        }
    }

}
