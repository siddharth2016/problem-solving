package src.trees;

public class DistanceBetweenNodesBST {

    public int solve(TreeNode A, int B, int C) {
        int minVal = Integer.min(B, C);
        int maxVal = Integer.max(B, C);
        TreeNode lca = lcaNode(A, minVal, maxVal);
        int depthB = height(lca, minVal, 0);
        int depthC = height(lca, maxVal, 0);
        return depthB + depthC;
    }

    public TreeNode lcaNode(TreeNode root, int val1, int val2) {
        if(root == null) return null;
        if(val1 <= root.val && root.val <= val2) return root;
        if(root.val > val1) return lcaNode(root.left, val1, val2);
        else return lcaNode(root.right, val1, val2);
    }

    public int height(TreeNode root, int key, int depth) {
        if(root == null) return 0;
        if(root.val == key) return depth;
        if(root.val > key) return height(root.left, key, depth+1);
        else return height(root.right, key, depth+1);
    }

}
