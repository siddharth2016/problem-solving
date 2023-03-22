package src.trees;

public class BSTNodesInARange {

    public int solve(TreeNode A, int B, int C) {
        if(A == null) return 0;

        if(B < A.val && A.val < C) return solve(A.left, B, C) + 1 + solve(A.right, B, C);
        if(B == A.val) return solve(A.right, B, C) + 1;
        if(C == A.val) return solve(A.left, B, C) + 1;
        return solve(A.left, B, C) + solve(A.right, B, C);
    }

}
