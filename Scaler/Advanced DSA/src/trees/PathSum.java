package src.trees;

public class PathSum {

    public int hasPathSum(TreeNode A, int B) {
        return pathExists(A, B, 0) ? 1 : 0;
    }

    public boolean pathExists(TreeNode root, int sum, int currSum) {
        if(root == null) return false;
        if(root.left == null && root.right == null) {
            if(sum == currSum + root.val) return true;
        }
        if(pathExists(root.left, sum, currSum+root.val) || pathExists(root.right, sum, currSum+root.val)) {
            return true;
        }
        return false;
    }

}
