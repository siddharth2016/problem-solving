package src.linkedlist;

public class RemoveLoop {

    public ListNode solve(ListNode A) {

        ListNode slow = A;
        ListNode fast = A;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow) break;
        }

        slow = A;

        while(fast != slow) {
            slow = slow.next;
            fast = fast.next;
        }

        while(fast.next != slow) {
            fast = fast.next;
        }

        fast.next = null;

        return A;

    }

}
