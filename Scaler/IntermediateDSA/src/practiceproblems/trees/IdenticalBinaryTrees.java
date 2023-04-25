package practiceproblems.trees;

import java.util.ArrayList;

public class IdenticalBinaryTrees {

    public int sameTree(TreeNode A, TreeNode B) {
        if(A == null && B == null) return 1;
        if(A == null || B == null) return 0;
        if(A.val != B.val) return 0;

        return sameTree(A.left, B.left) & sameTree(A.right, B.right);
    }

    public int isSameTree(TreeNode A, TreeNode B) {
        return sameTree(A, B);
    }


    /*
    public ArrayList<Integer> inorderTraversal(TreeNode root, ArrayList<Integer> arr) {
        if(root == null) return arr;

        inorderTraversal(root.left, arr);
        arr.add(root.val);
        inorderTraversal(root.right, arr);

        return arr;
    }

    public int isSameTree(TreeNode A, TreeNode B) {
        ArrayList<Integer> treeA = inorderTraversal(A, new ArrayList<Integer>());
        ArrayList<Integer> treeB = inorderTraversal(B, new ArrayList<Integer>());

        if(treeA.equals(treeB)) return 1;
        return 0;
    }
     */
}
