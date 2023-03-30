package src.tries;

import java.util.HashMap;
import java.util.Map;

public class ValidPhoneDirectory {

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

        public boolean insert(String str) {
            Node temp = this.root;
            boolean possible = true;
            for(Character chr: str.toCharArray()) {
                if(!temp.map.containsKey(chr)) {
                    temp.map.put(chr, new Node(chr));
                }
                temp = temp.map.get(chr);
                if(temp.isTerminal) possible = false;
            }
            temp.isTerminal = true;
            return possible && temp.map.size() == 0;
        }
    }

    public int solve(String[] A) {
        Trie trie = new Trie();
        for(String str: A) {
            if(!trie.insert(str)) return 0;
        }
        return 1;
    }

}
