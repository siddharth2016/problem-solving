package src.tries;

import java.util.HashMap;
import java.util.Map;

public class SpellingChecker {

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
            root = new Node('\0');
        }

        public void insert(String str) {
            Node temp = root;
            for(Character chr: str.toCharArray()) {
                if(!temp.map.containsKey(chr)) {
                    temp.map.put(chr, new Node(chr));
                }
                temp = temp.map.get(chr);
            }
            temp.isTerminal = true;
        }

        public int search(String str) {
            Node temp = root;
            for(Character chr: str.toCharArray()) {
                if(!temp.map.containsKey(chr)) return 0;
                temp = temp.map.get(chr);
            }
            return temp.isTerminal ? 1 : 0;
        }
    }

    public int[] solve(String[] A, String[] B) {
        Trie trie = new Trie();
        for(String str: A) {
            trie.insert(str);
        }
        int[] result = new int[B.length];
        for(int i=0; i<B.length; i++) {
            result[i] = trie.search(B[i]);
        }
        return result;
    }
}
