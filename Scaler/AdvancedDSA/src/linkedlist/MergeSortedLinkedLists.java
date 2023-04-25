package src.linkedlist;

public class MergeSortedLinkedLists {

    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        if(A == null) return B;
        if(B == null) return A;
        ListNode head;
        if(A.val < B.val) {
            head = A;
            head.next = mergeTwoLists(A.next, B);
        }
        else {
            head = B;
            head.next = mergeTwoLists(A, B.next);
        }
        return head;
    }

}
