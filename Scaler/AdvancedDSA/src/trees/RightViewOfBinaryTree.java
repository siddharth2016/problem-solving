package src.trees;

import java.util.ArrayList;

public class RightViewOfBinaryTree {

    int maxLevel = 0;
    public int[] solve(TreeNode A) {
        ArrayList<Integer> arr = new ArrayList<>();
        rightView(A, arr, 1);
        int[] result = new int[arr.size()];
        for(int i=0; i<arr.size(); i++) {
            result[i] = arr.get(i);
        }
        return result;
    }

    public void rightView(TreeNode root, ArrayList<Integer> arr, int level) {
        if(root == null) return;
        if(maxLevel < level) {
            arr.add(root.val);
            maxLevel = level;
        }
        rightView(root.right, arr, level+1);
        rightView(root.left, arr, level+1);
    }

}
