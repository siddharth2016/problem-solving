package src.studyplan75;

public class LC_98_ValidateBST {

    public boolean isValidBST(TreeNode root) {
        return checkBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean checkBST(TreeNode root, long minVal, long maxVal) {
        if(root == null) return true;
        if(root.val >= maxVal || root.val <= minVal) return false;
        return checkBST(root.left, minVal, root.val) && checkBST(root.right, root.val, maxVal);
    }

}
