package src.trees;

import java.util.ArrayList;
import java.util.HashSet;

public class LowesetCommonAncestor {

    public int lca(TreeNode A, int B, int C) {
        int ans = -1;
        ArrayList<Integer> p = new ArrayList<>();
        ArrayList<Integer> q = new ArrayList<>();
        getPath(A, B, p);
        getPath(A, C, q);
        HashSet<Integer> set = new HashSet<>();

        for (int i =0; i <q.size(); i++){
            set.add(q.get(i));
        }

        for (int i = p.size() - 1; i >= 0; i--) {
            if(set.contains(p.get(i))){
                ans = p.get(i);
            }
        }

        return ans;
    }

    public boolean getPath(TreeNode root, int d, ArrayList<Integer> path) {
        if (root == null) {
            return false;
        }
        if (root.val == d) {
            path.add(root.val);
            return true;
        }
        if(getPath(root.right, d, path) || getPath(root.left, d, path)) {
            path.add(root.val);
            return true;
        }
        return false;
    }

}
