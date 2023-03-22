package src.trees;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class ZigZagLevelOrderTraversal {

    public int[][] zigzagLevelOrder(TreeNode A) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        Deque<TreeNode> dq = new LinkedList<>();
        ArrayList<Integer> tempArr = new ArrayList<>();
        dq.addLast(A);
        dq.addLast(null);
        while(dq.size() != 0) {
            TreeNode temp = dq.removeFirst();
            if(temp == null) {
                arr.add(tempArr);
                if(dq.size() == 0) break;
                dq.addLast(null);
                tempArr = new ArrayList<>();
            }
            else {
                tempArr.add(temp.val);
                if(temp.left != null) dq.addLast(temp.left);
                if(temp.right != null) dq.addLast(temp.right);
            }
        }
        int[][] result = new int[arr.size()][];
        for(int i=0; i<arr.size(); i++) {
            int[] temp = new int[arr.get(i).size()];
            if(i % 2 == 1) {
                int k=0;
                for(int j=arr.get(i).size()-1; j>=0; j--) {
                    temp[k++] = arr.get(i).get(j);
                }
            }
            else {
                for(int j=0; j<arr.get(i).size(); j++) {
                    temp[j] = arr.get(i).get(j);
                }
            }
            result[i] = temp;
        }
        return result;
    }

}
