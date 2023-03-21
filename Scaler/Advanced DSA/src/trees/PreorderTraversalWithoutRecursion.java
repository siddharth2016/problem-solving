package src.trees;

import java.util.ArrayList;
import java.util.Stack;

public class PreorderTraversalWithoutRecursion {

    public int[] preorderTraversal(TreeNode A) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode root = A;
        ArrayList<Integer> list = new ArrayList<>();
        while(root!=null || !stack.isEmpty()){
            while(root!= null){
                list.add(root.val);
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            root = root.right;
        }

        int[] result = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

}
