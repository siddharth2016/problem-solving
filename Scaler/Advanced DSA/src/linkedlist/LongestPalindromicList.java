package src.linkedlist;

public class LongestPalindromicList {

    public int solve(ListNode A) {
        ListNode curr = A;
        ListNode prev = null;
        ListNode next;
        int result = Integer.MIN_VALUE;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            result = Integer.max(result, 2 * countNodes(prev, next) + 1);
            result = Integer.max(result, 2 * countNodes(curr, next));
            prev = curr;
            curr = next;
        }
        return result;
    }

    public int countNodes(ListNode A, ListNode B) {
        int count = 0;
        while(A != null && B != null) {
            if(A.val != B.val) break;
            count++;
            A = A.next;
            B = B.next;
        }
        return count;
    }

}
