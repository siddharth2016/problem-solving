package src.trees;

import java.util.ArrayList;

public class TwoSumBST {

    ArrayList<Integer> arr = new ArrayList<>();
    public int t2Sum(TreeNode A, int B) {
        traversal(A);
        int j = arr.size() - 1;
        int i = 0;
        while(i < j) {
            int val = arr.get(i) + arr.get(j);
            if(val == B) return 1;
            if(val < B) i++;
            else j--;
        }
        return 0;
    }

    public void traversal(TreeNode root) {
        if(root == null) return;

        traversal(root.left);
        arr.add(root.val);
        traversal(root.right);
    }

}
