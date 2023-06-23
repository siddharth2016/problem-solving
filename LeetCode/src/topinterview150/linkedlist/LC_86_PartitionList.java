package src.topinterview150.linkedlist;

import src.studyplan75.ListNode;

public class LC_86_PartitionList {

    public ListNode partition(ListNode head, int x) {
        ListNode ptr = head;
        ListNode lesserHead = null;
        ListNode greaterHead = null;
        ListNode greaterPtr = null;

        while(ptr != null) {
            if(ptr.val < x) {
                if(lesserHead == null) {
                    lesserHead = ptr;
                    head = ptr;
                }
                else {
                    lesserHead.next = ptr;
                    lesserHead = ptr;
                }
            }
            else {
                if(greaterHead == null) {
                    greaterHead = ptr;
                    greaterPtr = greaterHead;
                }
                else {
                    greaterPtr.next = ptr;
                    greaterPtr = ptr;
                }
            }
            ptr = ptr.next;
        }

        if(greaterHead == null || lesserHead == null) return head;

        greaterPtr.next = null;
        lesserHead.next = greaterHead;
        return head;
    }

}
