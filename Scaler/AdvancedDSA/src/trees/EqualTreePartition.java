package src.trees;

public class EqualTreePartition {

    int result = 0;
    public int solve(TreeNode A) {
        int totalSum = getTotalSum(A);
        checkPartition(A, totalSum);
        return result;
    }

    public int getTotalSum(TreeNode root) {
        if(root == null) return 0;
        return root.val + getTotalSum(root.left) + getTotalSum(root.right);
    }

    public int checkPartition(TreeNode root, int totalSum) {
        if(root == null) return 0;
        int sum = checkPartition(root.left, totalSum) + checkPartition(root.right, totalSum) + root.val;
        if(totalSum - sum == sum) result = 1;
        return sum;
    }

}
