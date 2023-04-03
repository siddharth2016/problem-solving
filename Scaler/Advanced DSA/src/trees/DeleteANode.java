package src.trees;

public class DeleteANode {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return root;

        else if(root.val > key) {
            root.left = deleteNode(root.left, key);
            return root;
        }

        else if(root.val < key) {
            root.right = deleteNode(root.right, key);
            return root;
        }

        else {
            if(root.left == null && root.right == null) return null;

            if(root.left == null) {
                return root.right;
            }

            if(root.right == null) {
                return root.left;
            }

            TreeNode temp = root.right;
            while(temp.left != null) {
                temp = temp.left;
            }
            root.val = temp.val;
            root.right = deleteNode(root.right, temp.val);
            return root;
        }
    }
}
