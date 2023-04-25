package src.trees;

public class SymmetricBinaryTree {

    public int isSymmetric(TreeNode A) {
        return checkSymmetric(A.left, A.right);
    }

    public int checkSymmetric(TreeNode A, TreeNode B) {
        if(A == null && B == null) return 1;
        if(A == null || B == null) return 0;
        if(A.val != B.val) return 0;
        return checkSymmetric(A.left, B.right) & checkSymmetric(A.right, B.left);
    }

}
