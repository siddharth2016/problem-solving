package src.linkedlist;

public class PalindromeList {

    public int lPalin(ListNode A) {
        ListNode mid = getMid(A);
        ListNode first = A;
        ListNode second = mid.next;
        mid.next = null;
        second = reverseList(second);

        while(first != null && second != null) {
            if(first.val != second.val) return 0;
            first = first.next;
            second = second.next;
        }

        if((first == null && second == null) || (first.next == null && second == null)) return 1;

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
        ListNode curr = head;
        ListNode prev = null;
        ListNode next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

}
