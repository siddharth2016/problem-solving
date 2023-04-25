package src.trees;

public class BalancedBinaryTree {

    public class Pair {
        int depth;
        boolean bal;
        public Pair(int depth, boolean bal) {
            this.depth = depth;
            this.bal = bal;
        }
    }

    public int isBalanced(TreeNode A) {
        return checkBalanced(0, A).bal ? 1 : 0;
    }

    public Pair checkBalanced(int depth, TreeNode root) {
        if(root == null) return new Pair(0, true);
        Pair leftDepth = checkBalanced(depth, root.left);
        Pair rightDepth = checkBalanced(depth, root.right);
        return new Pair(Integer.max(leftDepth.depth, rightDepth.depth) + 1, (int)Math.abs(leftDepth.depth - rightDepth.depth) <= 1 &&
                leftDepth.bal && rightDepth.bal);
    }

}
