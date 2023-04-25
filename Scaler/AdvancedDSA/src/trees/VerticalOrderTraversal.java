package src.trees;

import java.util.*;

public class VerticalOrderTraversal {

    public class PosNode {
        int depth;
        TreeNode node;
        public PosNode(int depth, TreeNode node) {
            this.depth = depth;
            this.node = node;
        }
    }

    public int[][] verticalOrderTraversal(TreeNode A) {
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        Deque<PosNode> dq = new LinkedList<>();
        dq.addLast(new PosNode(0, A));
        while(dq.size() != 0) {
            PosNode temp = dq.removeFirst();
            if(!map.containsKey(temp.depth)) {
                map.put(temp.depth, new ArrayList<>());
            }
            map.get(temp.depth).add(temp.node.val);
            if(temp.node.left != null) {
                dq.addLast(new PosNode(temp.depth - 1, temp.node.left));
            }
            if(temp.node.right != null) {
                dq.addLast(new PosNode(temp.depth + 1, temp.node.right));
            }
        }
        int len = map.size();
        int[][] result = new int[len][];
        int itrMin = Integer.MAX_VALUE;
        int itrMax = Integer.MIN_VALUE;
        int j = 0;
        for(int i: map.keySet()) {
            itrMax = Integer.max(itrMax, i);
            itrMin = Integer.min(itrMin, i);
        }
        for(int i=itrMin; i<=itrMax; i++) {
            int[] arr = new int[map.get(i).size()];
            for(int k=0; k<map.get(i).size(); k++) {
                arr[k] = map.get(i).get(k);
            }
            result[j] = arr;
            j++;
        }
        return result;
    }

}
