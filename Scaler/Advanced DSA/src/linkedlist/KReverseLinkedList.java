package src.linkedlist;

public class KReverseLinkedList {

    public ListNode reverseList(ListNode A, int B) {
        if(A == null) return A;

        ListNode current = A;
        ListNode prev = null;
        ListNode nextNode;

        int count = 0;

        while(count < B) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
            count++;
        }

        A.next = reverseList(current, B);

        return prev;
    }

}
