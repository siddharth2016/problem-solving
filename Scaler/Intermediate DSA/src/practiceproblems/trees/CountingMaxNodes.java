package practiceproblems.trees;

public class CountingMaxNodes {

    public int countNodes(TreeNode A, int max, int count) {
        if(A == null) return 0;
        if(A.val > max) {
            max = A.val;
            count++;
        }
        count += countNodes(A.left, max, 0);
        count += countNodes(A.right, max, 0);
        return count;
    }

    public int solve(TreeNode A) {
        return countNodes(A, 0, 0);
    }

}
