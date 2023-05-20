package src.may23circuit;

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

    public int search(int X, int num, Node temp, int i) {
        if(temp==null) return 0;
        if(X == num) return temp.sum;
        if(i >= 32) return 0;
        if((X&(1<<i)) != 0) num += (1<<i);
        if((X & (1<<i)) == 0) return search(X, num, temp.left, i+1) + search(X, num, temp.right, i+1);
        else return search(X, num, temp.left, i+1);
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
            System.out.println(trie.search(X, 0, trie.root, 0));
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
