package src;


class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Merge2SortedLists_21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = null;
        ListNode ptr = null;
        ListNode temp;
        while(list1 != null && list2 != null) {
            if(list1.val <= list2.val) {
                temp = list1;
                list1 = list1.next;
            }
            else {
                temp = list2;
                list2 = list2.next;
            }

            if(head == null) {
                head = temp;
                ptr = head;
            }
            else {
                ptr.next = temp;
                ptr = ptr.next;
            }
        }

        while(list1 != null) {
            if(head == null) {
                head = list1;
                ptr = head;
            }
            else {
                ptr.next = list1;
                ptr = ptr.next;
            }
            list1 = list1.next;
        }

        while(list2 != null) {
            if(head == null) {
                head = list2;
                ptr = head;
            }
            else {
                ptr.next = list2;
                ptr = ptr.next;
            }
            list2 = list2.next;
        }
        return head;
    }
}
