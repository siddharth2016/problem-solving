package src.topinterview150.linkedlist;

import src.studyplan75.ListNode;

public class LC_2_AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ptr1 = l1;
        ListNode ptr2 = l2;
        int carry = 0;
        ListNode head = null;
        ListNode temp = null;
        while(ptr1 != null && ptr2 != null) {
            int val = ptr1.val + ptr2.val + carry;
            carry = val / 10;
            if(head == null) {
                head = new ListNode(val % 10);
                temp = head;
            }
            else {
                temp.next = new ListNode(val % 10);
                temp = temp.next;
            }
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        while(ptr1 != null) {
            int val = ptr1.val + carry;
            carry = val / 10;
            temp.next = new ListNode(val % 10);
            temp = temp.next;
            ptr1 = ptr1.next;
        }
        while(ptr2 != null) {
            int val = ptr2.val + carry;
            carry = val / 10;
            temp.next = new ListNode(val % 10);
            temp = temp.next;
            ptr2 = ptr2.next;
        }
        if(carry != 0) temp.next = new ListNode(carry);

        return head;
    }

}
