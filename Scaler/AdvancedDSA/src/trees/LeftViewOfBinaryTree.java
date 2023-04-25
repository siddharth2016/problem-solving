package src.trees;

import java.util.ArrayList;

public class LeftViewOfBinaryTree {

    int maxLevel = 0;
    public int[] solve(TreeNode A) {
        ArrayList<Integer> arr = new ArrayList<>();
        leftView(A, arr, 1);
        int[] result = new int[arr.size()];
        for(int i=0; i<arr.size(); i++) {
            result[i] = arr.get(i);
        }
        return result;
    }

    public void leftView(TreeNode root, ArrayList<Integer> arr, int level) {
        if(root == null) return;
        if(maxLevel < level) {
            arr.add(root.val);
            maxLevel = level;
        }
        leftView(root.left, arr, level+1);
        leftView(root.right, arr, level+1);
    }

}
