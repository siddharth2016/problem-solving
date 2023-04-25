package practiceproblems.trees;

public class BSTNodesInRange {

    public int solve(TreeNode A, int B, int C) {
        return solveHelper(A, B, C, 0);
    }

    public int solveHelper(TreeNode A, int B, int C, int count) {
        if(A == null) return count;

        if(B <= A.val && A.val <= C) {
            count++;
            count += solveHelper(A.left, B, C, 0);
            count += solveHelper(A.right, B, C, 0);
        }
        else if(A.val <= B) count += solveHelper(A.right, B, C, 0);
        else count += solveHelper(A.left, B, C, 0);
        return count;
    }

}
