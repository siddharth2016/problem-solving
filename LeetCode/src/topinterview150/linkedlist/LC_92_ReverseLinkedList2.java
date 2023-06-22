package src.topinterview150.linkedlist;

import src.studyplan75.ListNode;

public class LC_92_ReverseLinkedList2 {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode prev = null;
        ListNode curr = head;
        int count = 1;
        ListNode result = head;
        while(curr != null) {
            if(count == left) {
                ListNode tempPrev = null;
                ListNode tempNext = null;
                ListNode tempCurr = curr;
                while(count <= right) {
                    tempNext = curr.next;
                    curr.next = tempPrev;
                    tempPrev = curr;
                    curr = tempNext;
                    count++;
                }
                tempCurr.next = curr;
                if(prev != null) prev.next = tempPrev;
                else result = tempPrev;
            }
            else {
                prev = curr;
                curr = curr.next;
                count++;
            }
        }
        return result;
    }

}
