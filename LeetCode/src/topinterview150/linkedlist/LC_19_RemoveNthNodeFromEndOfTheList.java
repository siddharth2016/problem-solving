package src.topinterview150.linkedlist;

import src.studyplan75.ListNode;

public class LC_19_RemoveNthNodeFromEndOfTheList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        ListNode tempPrev = head;
        int count = 1;
        while(count <= n) {
            temp = temp.next;
            count++;
        }
        if(temp == null) {
            head = head.next;
            return head;
        }
        while(temp.next != null) {
            temp = temp.next;
            tempPrev = tempPrev.next;
        }
        tempPrev.next = tempPrev.next.next;
        return head;
    }

}
