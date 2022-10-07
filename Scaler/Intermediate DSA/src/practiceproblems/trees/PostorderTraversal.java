package practiceproblems.trees;

import java.util.ArrayList;

public class PostorderTraversal {

    ArrayList<Integer> result = new ArrayList<>();
    public ArrayList<Integer> postorderTraversal(TreeNode A) {
        if(A == null) return result;

        postorderTraversal(A.left);
        postorderTraversal(A.right);
        result.add(A.val);

        return result;
    }

}
