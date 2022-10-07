package practiceproblems.trees;

public class HeightOfBinaryTree {

    public int solve(TreeNode A) {
        if(A == null) return 0;

        return Math.max(solve(A.left), solve(A.right)) + 1;
    }

}
