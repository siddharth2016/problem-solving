package src.linkedlist;

public class ListCycle {

    public ListNode detectCycle(ListNode a) {

        ListNode slow = a;
        ListNode fast = a;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow) break;
        }

        if(fast == null || fast.next == null) return null;

        slow = a;

        while(fast != slow) {
            slow = slow.next;
            fast = fast.next;
        }

        return fast;

    }

}
