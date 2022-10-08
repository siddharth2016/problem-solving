package practiceproblems.trees;

public class SymmetricBinaryTree {

    public int isSameSym(TreeNode A, TreeNode B) {
        if(A == null && B == null) return 1;
        if(A == null || B == null) return 0;
        if(A.val != B.val) return 0;

        return isSameSym(A.left, B.right) & isSameSym(A.right, B.left);
    }

    public int isSymmetric(TreeNode A) {
        if(A == null) return 0;
        return isSameSym(A.left, A.right);
    }

}
