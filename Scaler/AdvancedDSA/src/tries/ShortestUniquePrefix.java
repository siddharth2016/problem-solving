package src.tries;

import java.util.HashMap;
import java.util.Map;

public class ShortestUniquePrefix {

    class Node {
        int freq;
        char val;
        Map<Character, Node> map;

        public Node(char val) {
            this.val = val;
            this.freq = 0;
            this.map = new HashMap<>();
        }
    }

    class Trie {
        Node root;

        public Trie() {
            root = new Node('\0');
        }

        public void insert(String str) {
            Node temp = this.root;
            for(Character chr: str.toCharArray()) {
                if(!temp.map.containsKey(chr)) {
                    temp.map.put(chr, new Node(chr));
                }
                temp = temp.map.get(chr);
                temp.freq += 1;
            }
        }

        public String searchPrefix(String str) {
            Node temp = root;
            StringBuilder result = new StringBuilder();
            for(Character chr: str.toCharArray()) {
                if(temp.freq == 1) break;
                temp = temp.map.get(chr);
                result.append(chr);
            }
            return result.toString();
        }
    }

    public String[] prefix(String[] A) {
        Trie trie = new Trie();
        for(String str: A) {
            trie.insert(str);
        }
        String[] result = new String[A.length];
        for(int i=0; i<A.length; i++) {
            result[i] = trie.searchPrefix(A[i]);
        }
        return result;
    }

}
