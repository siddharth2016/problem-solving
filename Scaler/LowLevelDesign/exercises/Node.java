package exercises;

import java.util.Iterator;

public class Node implements Iterable<Node> {
    int data;
    Node next;

    public Node(int d) {
        data = d;
        next = null;
    }

    public Node(int d, Node n) {
        data = d;
        next = n;
    }

    @Override
    public Iterator<Node> iterator() {
        return new NodeIterator(this);
    }
}

class NodeIterator implements Iterator<Node> {

    private Node root;

    public NodeIterator(Node node) {
        root = node;
    }

    @Override
    public boolean hasNext() {
        return root != null;
    }

    @Override
    public Node next() {
        Node temp = root;
        root = root.next;
        return temp;
    }
}