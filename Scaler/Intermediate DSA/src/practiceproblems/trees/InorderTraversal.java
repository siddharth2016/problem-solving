package practiceproblems.trees;

import java.util.ArrayList;

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

public class InorderTraversal {

    ArrayList<Integer> result = new ArrayList<>();
    public ArrayList<Integer> inorderTraversal(TreeNode A) {
        if(A == null) return null;
        inorderTraversal(A.left);
        result.add(A.val);
        inorderTraversal(A.right);
        return result;
    }

}
