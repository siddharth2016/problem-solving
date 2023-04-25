package src.trees;

import java.util.Deque;
import java.util.LinkedList;

public class OddEvenLevels {

    public int solve(TreeNode A) {
        Deque<TreeNode> dq = new LinkedList<>();
        dq.addLast(A);
        dq.addLast(null);
        int evenSum = 0;
        int oddSum = 0;
        int level = 1;
        int currentSum = 0;
        while(dq.size() != 0) {
            TreeNode temp = dq.removeFirst();
            if(temp == null) {
                if(level % 2 == 0) evenSum += currentSum;
                else oddSum += currentSum;
                currentSum = 0;
                if(dq.size() == 0) break;
                dq.addLast(null);
                level++;
            }
            else {
                currentSum += temp.val;
                if(temp.left != null) dq.addLast(temp.left);
                if(temp.right != null) dq.addLast(temp.right);
            }
        }
        return oddSum - evenSum;
    }

}
