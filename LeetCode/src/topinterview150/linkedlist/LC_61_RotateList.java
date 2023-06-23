package src.topinterview150.linkedlist;

import src.studyplan75.ListNode;

public class LC_61_RotateList {

    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return head;

        int length = 0;
        ListNode ptr = head;
        while(ptr != null) {
            length++;
            ptr = ptr.next;
        }
        int rotations = k % length;
        if(rotations == 0) return head;

        ListNode resultHead = reverse(head);
        int count = 0;
        ptr = resultHead;
        ListNode prevPtr = null;
        while(count < rotations) {
            prevPtr = ptr;
            ptr = ptr.next;
            count++;
        }
        prevPtr.next = null;
        resultHead = reverse(resultHead);

        ListNode nextHead = reverse(ptr);
        ptr = resultHead;
        while(ptr.next != null) {
            ptr = ptr.next;
        }
        ptr.next = nextHead;

        return resultHead;
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode next = null;
        ListNode curr = head;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

}
