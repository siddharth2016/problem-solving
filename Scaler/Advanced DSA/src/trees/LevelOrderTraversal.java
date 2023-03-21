package src.trees;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class LevelOrderTraversal {

    public int[][] solve(TreeNode A) {
        Deque<TreeNode> dq = new LinkedList<>();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        dq.addLast(A);
        dq.addLast(null);

        while(dq.size() != 0) {
            if(dq.peekFirst() == null) {
                arr.add(temp);
                dq.removeFirst();
                if(dq.size() == 0) break;
                dq.addLast(null);
                temp = new ArrayList<>();
            }
            else {
                TreeNode tempNode = dq.peekFirst();
                if(tempNode.left != null) dq.addLast(tempNode.left);
                if(tempNode.right != null) dq.addLast(tempNode.right);
                temp.add(dq.removeFirst().val);
            }
        }

        int[][] result = new int[arr.size()][];

        for(int i=0; i<arr.size(); i++) {
            int[] tempArr = new int[arr.get(i).size()];
            for(int j=0; j<arr.get(i).size(); j++) {
                tempArr[j] = arr.get(i).get(j);
            }
            result[i] = tempArr;
        }

        return result;
    }

}
