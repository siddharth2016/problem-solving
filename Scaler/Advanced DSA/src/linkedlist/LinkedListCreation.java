package src.linkedlist;

public class LinkedListCreation {

    static class Node {
        int value;
        Node pointer;

        public Node(int val) {
            value = val;
            pointer = null;
        }
    }

    public static Node head = null;

    public static void insert_node(int position, int value) {
        // @params position, integer
        // @params value, integer

        Node newNode = new Node(value);

        if(position == 1) {
            newNode.pointer = head;
            head = newNode;
        }

        else {
            Node temp = head;
            int count = 1;
            while(temp != null && count < position-1) {
                temp = temp.pointer;
                count++;
            }
            newNode.pointer = temp.pointer;
            temp.pointer = newNode;
        }
    }

    public static void delete_node(int position) {
        // @params position, integer
        int count = 1;
        Node temp = head;
        if(position == 1) {
            head = temp.pointer;
            temp.pointer = null;
        }
        else {
            while(temp != null && count < position - 1) {
                temp = temp.pointer;
                count++;
            }
            if(temp != null && temp.pointer != null) {
                Node nextNode = temp.pointer;
                temp.pointer = nextNode.pointer;
                nextNode.pointer = null;
            }
        }
    }

    public static void print_ll() {
        // Output each element followed by a space
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value);
            if(temp.pointer != null) System.out.print(" ");
            temp = temp.pointer;
        }
    }

}
