package src.trees;

public class SumBinaryTreeOrNot {

    class Pair {
        boolean bool;
        int sum;
        public Pair(int sum, boolean bool) {
            this.sum = sum;
            this.bool = bool;
        }
    }

    public int solve(TreeNode A) {
        return checkSumBinaryTree(A, new Pair(0, true)).bool ? 1 : 0;
    }

    public Pair checkSumBinaryTree(TreeNode root, Pair pair) {
        if(root == null) return pair;
        if(root.left == null && root.right == null) return new Pair(root.val, true);
        Pair leftPair = checkSumBinaryTree(root.left, pair);
        Pair rightPair = checkSumBinaryTree(root.right, pair);
        int sum = leftPair.sum + rightPair.sum;
        return new Pair(sum + root.val, sum == root.val && leftPair.bool && rightPair.bool);
    }

}
