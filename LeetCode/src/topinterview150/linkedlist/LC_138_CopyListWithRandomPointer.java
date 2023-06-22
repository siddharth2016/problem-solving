package src.topinterview150.linkedlist;

import java.util.HashMap;
import java.util.Map;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class LC_138_CopyListWithRandomPointer {

    public Node copyRandomList(Node head) {
        if(head == null) return null;

        Node resultHead = null;
        Node newTemp = null;
        Node temp = head;

        Map<Node, Node> map = new HashMap<>();

        while(temp != null) {
            if(resultHead == null) {
                resultHead = new Node(temp.val);
                newTemp = resultHead;
            }
            else {
                newTemp.next = new Node(temp.val);
                newTemp = newTemp.next;
            }
            map.put(temp, newTemp);
            temp = temp.next;
        }

        temp = head;
        while(temp != null) {
            map.get(temp).random = map.get(temp.random);
            temp = temp.next;
        }

        return resultHead;
    }

}
