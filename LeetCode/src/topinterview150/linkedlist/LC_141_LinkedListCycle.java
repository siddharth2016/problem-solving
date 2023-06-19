package src.topinterview150.linkedlist;

import src.studyplan75.ListNode;

public class LC_141_LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) break;
        }

        return !(fast == null || fast.next == null);
    }

}
