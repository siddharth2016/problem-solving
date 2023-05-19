package src.graphs;

import java.util.*;

class UndirectedGraphNode {
      int label;
      List<UndirectedGraphNode> neighbors;
      UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
}

public class CloneGraph {

    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        Queue<UndirectedGraphNode> queue = new LinkedList<>();
        Map<Integer, UndirectedGraphNode> map = new HashMap<>();
        UndirectedGraphNode root = new UndirectedGraphNode(node.label);
        map.put(root.label, root);
        queue.add(node);
        while(!queue.isEmpty()) {
            UndirectedGraphNode temp = queue.poll();
            for(UndirectedGraphNode val: temp.neighbors) {
                if(!map.containsKey(val.label)) {
                    UndirectedGraphNode new_node = new UndirectedGraphNode(val.label);
                    map.put(new_node.label, new_node);
                    queue.add(val);
                }
                map.get(temp.label).neighbors.add(map.get(val.label));
            }
        }
        return root;
    }

}
