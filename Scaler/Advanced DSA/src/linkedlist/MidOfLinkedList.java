package src.linkedlist;

public class MidOfLinkedList {

    public int solve(ListNode A) {
        ListNode mid = A;
        ListNode fast = A;
        while(fast != null && fast.next != null) {
            mid = mid.next;
            fast = fast.next.next;
        }
        return mid.val;
    }

}
