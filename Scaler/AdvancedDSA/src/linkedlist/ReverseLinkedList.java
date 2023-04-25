package src.linkedlist;


class ListNode {
    public int val;
    public ListNode next;
    ListNode(int x) { val = x; next = null; }
}

public class ReverseLinkedList {

    public ListNode reverseList(ListNode A) {
        ListNode current = A;
        ListNode prev = null;
        ListNode nextNode;

        while(current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        return prev;
    }

}
