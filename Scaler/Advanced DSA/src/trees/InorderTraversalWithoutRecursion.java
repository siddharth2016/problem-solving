package src.trees;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
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
        ArrayList<TreeNode> arr = new ArrayList<>();
        Set<TreeNode> set = new HashSet<>();
        Stack<TreeNode> stack = new Stack<>();

        set.add(A);
        stack.push(A);
        while(!stack.isEmpty()) {
            while(stack.peek().left != null && !set.contains(stack.peek().left)) {
                set.add(stack.peek().left);
                stack.push(stack.peek().left);
            }
            TreeNode temp = stack.pop();
            arr.add(temp);
            if(temp.right != null) {
                set.add(temp.right);
                stack.push(temp.right);
            }
        }

        int[] result = new int[arr.size()];
        for(int i=0; i<arr.size(); i++) {
            result[i] = arr.get(i).val;
        }

        return result;
    }

}
