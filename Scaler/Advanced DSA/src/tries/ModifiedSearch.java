package src.tries;

import java.util.HashMap;
import java.util.Map;

public class ModifiedSearch {

    class Node {
        char val;
        Map<Character, Node> map;
        boolean isTerminal;

        public Node(char val) {
            this.val = val;
            this.map = new HashMap<>();
            this.isTerminal = false;
        }
    }

    class Trie {
        public Node root;

        public Trie() {
            this.root = new Node('\0');
        }

        public void insert(String str) {
            Node temp = this.root;

            for(Character chr: str.toCharArray()) {
                if(!temp.map.containsKey(chr)) {
                    temp.map.put(chr, new Node(chr));
                }
                temp = temp.map.get(chr);
            }

            temp.isTerminal = true;
        }

        public boolean search(String str, Node root, int index, int flag) {
            if(index == str.length()) {
                return flag == 1 && root.isTerminal;
            }

            char chr = str.charAt(index);
            boolean ans = false;
            if(flag == 0) {
                for(Character key: root.map.keySet()) {
                    if(key == chr) ans = ans || search(str, root.map.get(key), index+1, flag);
                    else ans = ans || search(str, root.map.get(key), index+1, 1-flag);
                }
            }
            else {
                if(root.map.containsKey(chr)) {
                    ans = search(str, root.map.get(chr), index+1, flag);
                }
            }

            return ans;
        }
    }

    public String solve(String[] A, String[] B) {
        Trie trie = new Trie();
        for(String str: A) {
            trie.insert(str);
        }
        StringBuilder sb = new StringBuilder();
        for(String str: B) {
            sb.append(trie.search(str, trie.root, 0, 0) ? "1" : "0");
        }
        return sb.toString();
    }

}
