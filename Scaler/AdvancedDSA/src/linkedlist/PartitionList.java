package src.linkedlist;

public class PartitionList {

    public ListNode partition(ListNode A, int B) {
        if(A == null || A.next == null) return A;
        ListNode lesserPrev = null;
        ListNode greaterPrev = null;
        ListNode greaterHead = null;
        ListNode head = A;

        while(A != null) {
            if(A.val < B) {
                if(lesserPrev != null) {
                    lesserPrev.next = A;
                    lesserPrev = A;
                }
                else {
                    lesserPrev = A;
                    head = A;
                }
            }
            else {
                if(greaterPrev != null) {
                    greaterPrev.next = A;
                    greaterPrev = A;
                }
                else {
                    greaterPrev = A;
                    greaterHead = A;
                }
            }
            A = A.next;
        }

        if(greaterPrev != null) {
            greaterPrev.next = null;
        }
        if(lesserPrev != null) {
            lesserPrev.next = greaterHead;
        }

        return head;
    }

}
