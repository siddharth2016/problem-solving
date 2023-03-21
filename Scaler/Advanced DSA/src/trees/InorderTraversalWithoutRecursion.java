package src.trees;

import java.util.ArrayList;
import java.util.Stack;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;

      TreeNode(int x) {
       val = x;
       left=null;
       right=null;
      }
}

public class InorderTraversalWithoutRecursion {

    public int[] inorderTraversal(TreeNode A) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode root = A;
        ArrayList<Integer> list = new ArrayList<>();
        while(root!=null || !stack.isEmpty()){
            while(root!= null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            list.add(root.val);
            root = root.right;
        }

        int[] result = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

}
