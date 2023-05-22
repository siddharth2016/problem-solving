package src.may23circuit;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// partially accepted 50%

class Node {
    Node left;
    Node right;
    int sum;
    public Node(int val) {
        sum = val;
        left = null;
        right = null;
    }
}

class Trie {
    Node root;

    public Trie() {
        root = new Node(0);
    }

    public void insert(int val) {
        Node temp = root;
        for(int i=0; i<32; i++) {
            if((val & (1<<i)) == 0) {
                if(temp.left == null) {
                    temp.left = new Node(val);
                    temp = temp.left;
                }
                else {
                    temp = temp.left;
                    temp.sum += val;
                }
            }
            else {
                if(temp.right == null) {
                    temp.right = new Node(val);
                    temp = temp.right;
                }
                else {
                    temp = temp.right;
                    temp.sum += val;
                }
            }
        }
    }

    public long search(int X) {
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(root, X));
        long ans = 0L;
        while(!queue.isEmpty()) {
            Pair pair = queue.poll();
            Node node = pair.node;
            int num = pair.num;
            if(num == 0) ans += node.sum;
            else {
                int bit = num & 1;
                if (node.left != null) queue.add(new Pair(node.left, num >> 1));
                if (bit == 0 && node.right != null) queue.add(new Pair(node.right, num >> 1));
            }
        }
        return ans;
    }
}

class Pair {
    Node node;
    int num;
    public Pair(Node node, int num) {
        this.node = node;
        this.num = num;
    }
}

public class CompatibilityQueries {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); scan.nextLine();
        int[] arr = new int[n];
        Trie trie = new Trie();
        for(int i=0; i<n; i++) {
            arr[i] = scan.nextInt();
            trie.insert(arr[i]);
        }
        scan.nextLine();
        int q = scan.nextInt(); scan.nextLine();
        for(int i=0; i<q; i++) {
            int X = scan.nextInt();scan.nextLine();
            System.out.println(trie.search(X));
        }
    }

//    public static void pprint(int[][] dp) {
//        System.out.println();
//        for(int i=0; i<=5; i++) {
//            for(int j=0; j<=5; j++) {
//                System.out.print(dp[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }

}
