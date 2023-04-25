package practiceproblems.trees;

import java.util.ArrayList;

public class PreorderTraversal {

    ArrayList<Integer> result = new ArrayList<>();
    public ArrayList<Integer> preorderTraversal(TreeNode A) {
        if(A == null) return result;

        result.add(A.val);
        preorderTraversal(A.left);
        preorderTraversal(A.right);
        return result;
    }

}
