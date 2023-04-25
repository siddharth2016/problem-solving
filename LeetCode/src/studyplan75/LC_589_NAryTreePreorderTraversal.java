package src.studyplan75;

import java.util.ArrayList;
import java.util.List;

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};

public class LC_589_NAryTreePreorderTraversal {

    List<Integer> result;
    public List<Integer> preorder(Node root) {
        result = new ArrayList<>();
        preTraversal(root);
        return result;
    }

    public void preTraversal(Node root) {
        if(root == null) return;
        result.add(root.val);
        if(root.children != null) {
            for(Node child: root.children) {
                preTraversal(child);
            }
        }
    }

}
