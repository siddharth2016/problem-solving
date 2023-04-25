package src.trees;

public class IdenticalBinaryTrees {

    public int isSameTree(TreeNode A, TreeNode B) {
        if(A == null && B == null) return 1;
        if(A == null || B == null) return 0;
        if(A.val != B.val) return 0;
        return isSameTree(A.left, B.left) & isSameTree(A.right, B.right);
    }

}
