package practiceproblems.trees;

import java.util.ArrayList;
import java.util.Collections;

public class PathToGivenNode {

    ArrayList<Integer> arr = new ArrayList<>();
    public ArrayList<Integer> solve(TreeNode A, int B) {
        findPath(A, B);
        Collections.reverse(arr);
        return arr;
    }

    public boolean findPath(TreeNode A, int B) {
        if(A == null) return false;

        if(A.val == B) {
            arr.add(A.val);
            return true;
        }

        boolean foundInLeftOrRight = findPath(A.left, B) || findPath(A.right, B);
        if(foundInLeftOrRight) {
            arr.add(A.val);
            return true;
        }

        return false;
    }

}
