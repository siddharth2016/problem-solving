package src.trees;

import java.util.Deque;
import java.util.LinkedList;


class TreeLinkNode {
      int val;
      TreeLinkNode left, right, next;
      TreeLinkNode(int x) { val = x; }
}

public class NextPointerBinaryTree {

    public void connect(TreeLinkNode root) {
        Deque<TreeLinkNode> dq = new LinkedList<>();
        dq.addLast(root);
        dq.addLast(null);
        while(dq.size() != 0) {
            TreeLinkNode temp = dq.removeFirst();
            if(temp == null) {
                if(dq.size() == 0) {
                    break;
                }
                dq.addLast(null);
            }
            else {
                temp.next = dq.peekFirst();
                if(temp.left != null) dq.addLast(temp.left);
                if(temp.right != null) dq.addLast(temp.right);
            }
        }
    }

}
