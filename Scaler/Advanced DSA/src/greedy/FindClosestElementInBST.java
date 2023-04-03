package src.greedy;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class FindClosestElementInBST {

    static int minDiff(Node root, int K)
    {
        if(root != null) {
            if(root.data == K) return 0;
            if(root.data > K) return Integer.min(minDiff(root.left, K), Math.abs(root.data - K));
            else return Integer.min(minDiff(root.right, K), Math.abs(root.data - K));
        }
        else return Integer.MAX_VALUE;
    }

}
