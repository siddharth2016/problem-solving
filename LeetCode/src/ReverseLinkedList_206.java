package src;

public class ReverseLinkedList_206 {

    public ListNode reverseList(ListNode head) {
        ListNode next = null;
        ListNode prev = null;
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
