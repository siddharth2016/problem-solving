package src.trees;

import java.util.*;

public class TopViewOfBinaryTree {

    public class PosNode {
        int depth;
        TreeNode node;
        PosNode(int depth, TreeNode node) {
            this.depth = depth;
            this.node = node;
        }
    }

    public int[] solve(TreeNode A) {
        ArrayList<Integer> arr = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        Deque<PosNode> dq = new LinkedList<>();
        dq.addLast(new PosNode(0, A));
        set.add(0);
        arr.add(A.val);
        while(dq.size() != 0) {
            PosNode temp = dq.removeFirst();
            if(!set.contains(temp.depth)) {
                arr.add(temp.node.val);
                set.add(temp.depth);
            }
            if(temp.node.left != null) {
                dq.addLast(new PosNode(temp.depth - 1, temp.node.left));
            }
            if(temp.node.right != null) {
                dq.addLast(new PosNode(temp.depth + 1, temp.node.right));
            }
        }
        int len = arr.size();
        int[] result = new int[len];
        for(int i=0; i<len; i++) {
            result[i] = arr.get(i);
        }
        return result;
    }

}
