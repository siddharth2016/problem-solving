package src.linkedlist;

public class SortLinkedList {

    public ListNode sortList(ListNode A) {
        return mergeSort(A);
    }

    public ListNode mergeSort(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode mid = getMid(head);
        ListNode A = head;
        ListNode B = mid.next;
        mid.next = null;
        A = mergeSort(A);
        B = mergeSort(B);
        return merge(A, B);
    }

    public ListNode merge(ListNode A, ListNode B) {
        if(A == null) return B;
        if(B == null) return A;
        ListNode head;
        if(A.val < B.val) {
            head = A;
            head.next = merge(A.next, B);
        }
        else {
            head = B;
            head.next = merge(A, B.next);
        }
        return head;
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

}
