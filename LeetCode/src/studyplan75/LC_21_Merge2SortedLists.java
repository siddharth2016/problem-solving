package src.studyplan75;

public class LC_21_Merge2SortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        ListNode head;
        if(list1.val < list2.val) {
            head = list1;
            head.next = mergeTwoLists(list1.next, list2);
        }
        else {
            head = list2;
            head.next = mergeTwoLists(list1, list2.next);
        }
        return head;
    }
}
