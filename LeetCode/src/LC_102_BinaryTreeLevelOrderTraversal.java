package src;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}


public class LC_102_BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return new ArrayList<>();
        Deque<TreeNode> dq = new LinkedList<>();
        dq.addLast(root);
        dq.addLast(null);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        while(dq.size() != 0) {
            TreeNode first = dq.removeFirst();
            if(first == null) {
                result.add(temp);
                if(dq.size() == 0) break;
                temp = new ArrayList<>();
                dq.addLast(null);
            }
            else {
                temp.add(first.val);
                if(first.left != null) dq.addLast(first.left);
                if(first.right != null) dq.addLast(first.right);
            }
        }
        return result;
    }

}
