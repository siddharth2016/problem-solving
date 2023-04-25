package src.trees;

public class ValidBinarySearchTree {

    public int isValidBST(TreeNode A) {
        return checkValidBST(A, Integer.MIN_VALUE, Integer.MAX_VALUE) ? 1 : 0;
    }

    public boolean checkValidBST(TreeNode root, int minRange, int maxRange) {
        if(root == null) return true;
        if(minRange == Integer.MIN_VALUE && maxRange == Integer.MAX_VALUE) {
            return checkValidBST(root.left, minRange, root.val) && checkValidBST(root.right, root.val, maxRange);
        }
        return minRange < root.val && root.val < maxRange &&
                checkValidBST(root.left, minRange, root.val) && checkValidBST(root.right, root.val, maxRange);
    }

}
