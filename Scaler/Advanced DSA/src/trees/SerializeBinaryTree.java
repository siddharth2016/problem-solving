package src.trees;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class SerializeBinaryTree {

    public int[] solve(TreeNode A) {
        Deque<TreeNode> dq = new LinkedList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        dq.addLast(A);
        while(dq.size() != 0) {
            TreeNode first = dq.removeFirst();
            if(first == null) {
                arr.add(-1);
            }
            else{
                arr.add(first.val);
                dq.addLast(first.left);
                dq.addLast(first.right);
            }
        }

        int[] result = new int[arr.size()];
        for(int i=0; i<arr.size(); i++) {
            result[i] = arr.get(i);
        }

        return result;
    }

}
