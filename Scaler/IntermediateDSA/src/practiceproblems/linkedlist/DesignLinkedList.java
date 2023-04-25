package practiceproblems.linkedlist;

import java.util.ArrayList;

public class DesignLinkedList {

    class ListNode {
        public int val;
        public ListNode next;
        ListNode(int x) { val = x; next = null; }
    }

    public int lengthOfList(ListNode head) {
        int count = 0;
        ListNode temp = head;
        while(temp!=null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public ListNode insert(ListNode head, ListNode newNode, int pos) {
        if(head == null) head = newNode;
        else if(pos == 0) {
            newNode.next = head;
            head = newNode;
        }
        else if(pos == -1 || pos == lengthOfList(head)) {
            ListNode temp = head;
            while(temp.next!=null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        else if (pos < lengthOfList(head)) {
            ListNode temp = head;
            int count=0;
            while(count<pos-1) {
                temp = temp.next;
                count++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        return head;
    }

    public ListNode delete(ListNode head, int pos) {
        if(pos == 0) {
            head = head.next;
        }
        else if(pos < lengthOfList(head)) {
            ListNode temp = head;
            int count = 0;
            while(count<pos-1) {
                temp = temp.next;
                count++;
            }
            temp.next = temp.next.next;
        }
        return head;
    }

    public ListNode solve(ArrayList<ArrayList<Integer>> A) {
        ListNode head = null;
        int lengthOfList = 0;
        for(ArrayList<Integer> list: A) {
            if(list.get(0) == 0) {
                ListNode newNode = new ListNode(list.get(1));
                head = insert(head, newNode, 0);
            }
            else if(list.get(0) == 1) {
                ListNode newNode = new ListNode(list.get(1));
                head = insert(head, newNode, -1);
            }
            else if(list.get(0) == 2) {
                ListNode newNode = new ListNode(list.get(1));
                head = insert(head, newNode, list.get(2));
            }
            else {
                head = delete(head, list.get(1));
            }
        }
        return head;
    }

}
