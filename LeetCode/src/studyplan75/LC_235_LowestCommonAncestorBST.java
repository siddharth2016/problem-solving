package src.studyplan75;

public class LC_235_LowestCommonAncestorBST {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return lca(root, Integer.min(p.val, q.val), Integer.max(p.val, q.val));
    }

    public TreeNode lca(TreeNode root, int min, int max) {
        if(root == null) return null;
        if(min <= root.val && root.val <= max) return root;
        if(min < root.val) return lca(root.left, min, max);
        else return lca(root.right, min, max);
    }

}
