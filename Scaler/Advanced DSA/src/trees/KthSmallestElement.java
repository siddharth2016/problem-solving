package src.trees;

import java.util.ArrayList;

public class KthSmallestElement {

    public int kthsmallest(TreeNode A, int B) {
        ArrayList<Integer> arr = inorderTraversal(A, new ArrayList<>());
        return arr.get(B-1);
    }

    public ArrayList<Integer> inorderTraversal(TreeNode root, ArrayList<Integer> arr) {
        if(root == null) return arr;
        inorderTraversal(root.left, arr);
        arr.add(root.val);
        inorderTraversal(root.right, arr);
        return arr;
    }

}
