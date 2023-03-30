package src.tries;

public class MaximumXOR {

    class Node {
        Node left;
        Node right;

        public Node() {
            left = null;
            right = null;
        }
    }

    class Trie {
        Node root;

        public Trie() {
            root = new Node();
        }

        public void insert(int val) {
            Node temp = root;
            for(int i=31; i>=0; i--) {
                if((val & (1<<i)) == 0) {
                    if(temp.left == null) temp.left = new Node();
                    temp = temp.left;
                }
                else {
                    if(temp.right == null) temp.right = new Node();
                    temp = temp.right;
                }
            }
        }

        public int searchXOR(int val) {
            Node temp = root;
            int maxXor = 0;
            for(int i=31; i>=0; i--) {
                int bit = val & (1<<i);
                if(bit == 0) {
                    if(temp.right != null) {
                        maxXor += (1<<i);
                        temp = temp.right;
                    }
                    else temp = temp.left;
                }
                else {
                    if(temp.left != null) {
                        maxXor += (1<<i);
                        temp = temp.left;
                    }
                    else temp = temp.right;
                }
            }
            return maxXor;
        }
    }

    public int solve(int[] A) {
        Trie trie = new Trie();
        for(int val: A) {
            trie.insert(val);
        }
        int maxXor = Integer.MIN_VALUE;
        for(int val: A) {
            maxXor = Integer.max(maxXor, trie.searchXOR(val));
        }
        return maxXor;
    }

}
