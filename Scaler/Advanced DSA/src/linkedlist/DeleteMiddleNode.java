package src.linkedlist;

public class DeleteMiddleNode {

    public ListNode solve(ListNode A) {

        ListNode mid = A;
        ListNode prev = null;
        ListNode fast = A;

        while(fast != null && fast.next != null) {
            prev = mid;
            mid = mid.next;
            fast = fast.next.next;
        }

        if(prev != null) {
            prev.next = mid.next;
            mid.next = null;
            return A;
        }

        return null;

    }

}
