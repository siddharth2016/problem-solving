package src.trees;

import java.util.Stack;

public class PostorderTraversalWithoutRecursion {

    public int[] postorderTraversal(TreeNode A) {
        Stack<TreeNode> stk1=new Stack<>();
        Stack<Integer> stk2=new Stack<>();
        stk1.push(A);
        TreeNode a;
        while(!stk1.isEmpty())
        {
            a=stk1.pop();
            stk2.push(a.val);
            if(a.left!=null)
                stk1.push(a.left);
            if(a.right!=null)
                stk1.push(a.right);
        }
        int[] arr=new int[stk2.size()];
        for(int i=0;i<arr.length;i++)
            arr[i]=stk2.pop();
        return arr;
    }

}
