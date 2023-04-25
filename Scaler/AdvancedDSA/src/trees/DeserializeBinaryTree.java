package src.trees;

import java.util.Deque;
import java.util.LinkedList;

public class DeserializeBinaryTree {

    public TreeNode solve(int[] A) {
        Deque<TreeNode> dq = new LinkedList<>();
        TreeNode root = new TreeNode(A[0]);
        dq.addLast(root);
        int i = 1;
        int j = 2;
        while(dq.size() != 0 && i < A.length && j < A.length) {
            TreeNode temp = dq.removeFirst();
            if(A[i] != -1) {
                temp.left = new TreeNode(A[i]);
                dq.addLast(temp.left);
            }
            if(A[j] != -1) {
                temp.right = new TreeNode(A[j]);
                dq.addLast(temp.right);
            }
            i+=2;
            j+=2;
        }
        return root;
    }

}
