package src;

public class LC_142_LinkedListCycle2 {

    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) break;
        }
        if(fast == null || fast.next == null) return null;

        slow = head;
        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

}
