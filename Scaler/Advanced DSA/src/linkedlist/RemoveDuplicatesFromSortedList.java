package src.linkedlist;

public class RemoveDuplicatesFromSortedList {

    public ListNode deleteDuplicates(ListNode A) {

        if(A == null) return null;

        ListNode slow = A;
        ListNode fast = A.next;
        ListNode temp;

        while(fast != null) {
            if(fast.val == slow.val) {
                temp = fast;
                fast = fast.next;
                slow.next = fast;
                temp.next = null;
            }
            else {
                slow = slow.next;
                fast = fast.next;
            }
        }

        return A;
    }

}
