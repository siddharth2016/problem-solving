package src.linkedlist;

public class ReorderList {

    public ListNode reorderList(ListNode A) {

        ListNode mid = getMid(A);
        ListNode list1 = A;
        ListNode list2 = mid.next;
        mid.next = null;
        list2 = reversedList(list2);

        ListNode next1;
        ListNode next2;
        ListNode newHead = list1;
        while(list1 != null && list2 != null) {
            next1 = list1.next;
            next2 = list2.next;
            list2.next = list1.next;
            list1.next = list2;
            list1 = next1;
            list2 = next2;
        }

        return newHead;
    }

    public ListNode getMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public ListNode reversedList(ListNode head) {
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
