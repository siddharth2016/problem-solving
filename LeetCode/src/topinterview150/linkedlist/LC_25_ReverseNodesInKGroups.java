package src.topinterview150.linkedlist;

import src.studyplan75.ListNode;

public class LC_25_ReverseNodesInKGroups {

    public ListNode reverseKGroup(ListNode head, int k) {
        int listLength = 0;
        ListNode temp = head;
        while(temp != null) {
            listLength++;
            temp = temp.next;
        }

        return reverseKSizeLists(head, k, k*(listLength / k), 1);
    }

    public ListNode reverseKSizeLists(ListNode curr, int k, int length, int currLen) {
        if(curr == null || currLen >= length) return curr;

        int count = 1;
        ListNode prev = null;
        ListNode next = null;
        ListNode head = curr;
        while(count <= k) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        head.next = reverseKSizeLists(curr, k, length, currLen+k);

        return prev;
    }

}
