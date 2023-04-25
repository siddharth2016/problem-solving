package src.trees;

import java.util.ArrayList;

public class RecoverBST {

    public int[] recoverTree(TreeNode A) {
        ArrayList<Integer> inorder = inorderTraversal(A, new ArrayList<>());
        int first = -1;
        int middle = -1;
        int last = -1;
        for(int i=0; i<inorder.size()-1; i++) {
            if(inorder.get(i) > inorder.get(i+1)) {
                if(first == -1) {
                    first = inorder.get(i);
                    middle = inorder.get(i+1);
                }
                else{
                    last = inorder.get(i+1);
                }
            }
        }
        int val1 = Math.min(first, middle);
        int val2 = Math.min(first, last);
        int val3 = first == val1 ? middle : first;
        int val4 = first == val2 ? last : first;
        if(last == -1) return new int[]{val1, val3};
        return new int[]{val2, val4};
    }

    public ArrayList<Integer> inorderTraversal(TreeNode root, ArrayList<Integer> arr) {
        if(root == null) return arr;
        inorderTraversal(root.left, arr);
        arr.add(root.val);
        inorderTraversal(root.right, arr);
        return arr;
    }

}
