package src.topinterview150.linkedlist;

import src.studyplan75.ListNode;

public class LC_82_RemoveDuplicatesFromSortedList2 {

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;

        ListNode resultHead = head;
        boolean repeating = false;
        ListNode ptr = head.next;
        while(ptr != null && ptr.val == head.val) {
            ptr = ptr.next;
            repeating = true;
        }

        if(repeating) {
            resultHead = deleteDuplicates(ptr);
        }
        else {
            resultHead.next = deleteDuplicates(ptr);
        }

        return resultHead;
    }

}
