package src.tries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ContactFinder {

    class Node {
        int freq;
        char val;
        Map<Character, Node> map;

        public Node(char val) {
            this.freq = 0;
            this.val = val;
            this.map = new HashMap<>();
        }
    }


    class Trie {
        Node root;

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
                temp.freq += 1;
            }
        }

        public int search(String str) {
            Node temp = this.root;

            for(Character chr: str.toCharArray()) {
                if(!temp.map.containsKey(chr)) return 0;
                temp = temp.map.get(chr);
            }

            return temp.freq;
        }
    }


    public int[] solve(int[] A, String[] B) {
        Trie trie = new Trie();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<A.length; i++) {
            if(A[i] == 0) {
                trie.insert(B[i]);
            }
            else {
                arr.add(trie.search(B[i]));
            }
        }
        int[] result = new int[arr.size()];
        for(int i=0; i<arr.size(); i++) {
            result[i] = arr.get(i);
        }

        return result;
    }

}
