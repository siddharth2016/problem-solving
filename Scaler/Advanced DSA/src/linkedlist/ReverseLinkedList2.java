package src.linkedlist;

public class ReverseLinkedList2 {

    public ListNode reverseBetween(ListNode A, int B, int C) {

        int countB = 1;
        int countC = B;

        ListNode start = A;
        ListNode prevStart = null;
        while(countB < B) {
            prevStart = start;
            start = start.next;
            countB++;
        }

        ListNode current = start;
        ListNode prev = null;
        ListNode nextNode;

        while(countC <= C) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
            countC++;
        }

        if(prevStart != null) {
            prevStart.next = prev;
        }
        else {
            A = prev;
        }
        start.next = current;
        return A;
    }

}
