package src.linkedlist;

public class PalindromeList {

    public int lPalin(ListNode A) {
        ListNode mid = getMid(A);
        ListNode first = A;
        ListNode second = mid.next;
        mid.next = null;
        second = reverseList(second);

        while(first != null && second != null && (first.val == second.val)) {
            first = first.next;
            second = second.next;
        }

        if((first == null && second == null) || (first != null && first.next == null && second == null)) {
            return 1;
        }

        return 0;
    }

    public ListNode getMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        ListNode next;

        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

}
