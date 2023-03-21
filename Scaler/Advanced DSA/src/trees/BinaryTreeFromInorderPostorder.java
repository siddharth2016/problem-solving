package src.trees;

import java.util.HashMap;
import java.util.Map;

public class BinaryTreeFromInorderPostorder {

    static int postIndx;

    public static TreeNode buildTree(int[] A, int[] B) {
        Map<Integer, Integer> inMap = new HashMap<>();
        for(int i=0; i<A.length; i++) {
            inMap.put(A[i], i);
        }
        postIndx = B.length - 1;
        return constructTree(A, B, inMap, 0, A.length - 1);
    }

    public static TreeNode constructTree(int[] inorder, int[] postorder, Map<Integer, Integer> inMap,
                                         int inStart, int inEnd) {
        if(inStart > inEnd) return null;

        TreeNode node = new TreeNode(postorder[postIndx]);
        int inIndex = inMap.get(postorder[postIndx]);
        postIndx--;

        if(inStart == inEnd) return node;
        node.right = constructTree(
                inorder, postorder, inMap, inIndex + 1, inEnd
        );
        node.left = constructTree(
                inorder, postorder, inMap, inStart, inIndex - 1
        );

        return node;
    }

}
