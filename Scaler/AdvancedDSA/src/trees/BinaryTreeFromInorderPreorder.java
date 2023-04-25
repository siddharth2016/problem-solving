package src.trees;

import java.util.HashMap;
import java.util.Map;

public class BinaryTreeFromInorderPreorder {

    static int preIndex;
    public static TreeNode buildTree(int[] A, int[] B) {
        Map<Integer, Integer> inMap = new HashMap<>();
        for(int i=0; i<B.length; i++) {
            inMap.put(B[i], i);
        }
        preIndex = 0;
        return constructTree(A, inMap, 0, B.length - 1);
    }

    public static TreeNode constructTree(int[] preorder, Map<Integer, Integer> inMap,
                                         int inStart, int inEnd) {
        if(inStart > inEnd) return null;

        TreeNode node = new TreeNode(preorder[preIndex]);
        int inIndex = inMap.get(preorder[preIndex]);
        preIndex++;

        if(inStart == inEnd) return node;

        node.left = constructTree(
                preorder, inMap, inStart, inIndex - 1
        );
        node.right = constructTree(
                preorder, inMap, inIndex + 1, inEnd
        );

        return node;
    }

}
