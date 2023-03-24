package src.trees;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CommonNodesBST {

    public int solve(TreeNode A, TreeNode B) {
        ArrayList<Integer> arrA = inorderTraversal(A, new ArrayList<>());
        ArrayList<Integer> arrB = inorderTraversal(B, new ArrayList<>());
        Set<Integer> set = new HashSet<>();
        int mod = (int)Math.pow(10, 9) + 7;
        long sum = 0l;
        for(int val: arrA) {
            set.add(val);
        }
        for(int val: arrB) {
            if(set.contains(val)) {
                sum = (sum % mod + val % mod) % mod;
            }
        }
        return (int)sum;
    }

    public ArrayList<Integer> inorderTraversal(TreeNode root, ArrayList<Integer> arr) {
        if(root == null) return arr;
        inorderTraversal(root.left, arr);
        arr.add(root.val);
        inorderTraversal(root.right, arr);
        return arr;
    }

}
