package src.tries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapSumPairs {

    class Node {
        int weight;
        char val;
        Map<Character, Node> map;

        public Node(char val) {
            this.val = val;
            this.weight = 0;
            this.map = new HashMap<>();
        }
    }

    class Trie {
        public Node root;
        Map<String, Integer> hash;

        public Trie() {
            this.root = new Node('\0');
            this.hash = new HashMap<>();
        }

        public void insert(String str, int wht) {
            Node temp = this.root;
            boolean update = false;
            int prevWeight = 0;
            if(this.hash.containsKey(str)) {
                update = true;
                prevWeight = this.hash.get(str);
            }
            this.hash.put(str, wht);
            for(Character chr: str.toCharArray()) {
                if(!temp.map.containsKey(chr)) temp.map.put(chr, new Node(chr));
                temp = temp.map.get(chr);
                if(!update) temp.weight += wht;
                else {
                    temp.weight = temp.weight - prevWeight + wht;
                }
            }
        }

        public int searchWeight(String str) {
            Node temp = this.root;
            for(Character chr: str.toCharArray()) {
                if(!temp.map.containsKey(chr)) return 0;
                temp = temp.map.get(chr);
            }
            return temp.weight;
        }
    }

    public int[] solve(String[] A, int[] B) {
        Trie trie = new Trie();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<A.length; i++) {
            if(B[i] == -1) {
                arr.add(trie.searchWeight(A[i]));
            }
            else {
                trie.insert(A[i], B[i]);
            }
        }
        int[] result = new int[arr.size()];
        for(int i=0; i<arr.size(); i++) {
            result[i] = arr.get(i);
        }
        return result;
    }

}
