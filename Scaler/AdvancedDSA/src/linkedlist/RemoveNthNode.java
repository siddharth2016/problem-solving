package src.linkedlist;

public class RemoveNthNode {

    public ListNode removeNthFromEnd(ListNode A, int B) {

        if(A == null) return null;

        ListNode slow = A;
        ListNode fast = A;

        int count = 0;
        while(fast != null && count < B) {
            fast = fast.next;
            count++;
        }

        if(fast == null) return A.next;

        ListNode prev = null;

        while(fast != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }

        prev.next = slow.next;
        slow.next = null;

        return A;
    }

}
