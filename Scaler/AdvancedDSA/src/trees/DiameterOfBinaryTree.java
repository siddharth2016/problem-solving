package src.trees;

public class DiameterOfBinaryTree {

    public class Pair {
        int height;
        int dia;
        public Pair(int height, int dia) {
            this.height = height;
            this.dia = dia;
        }
    }

    public int solve(TreeNode A) {
        if(A == null) return 0;
        return diameter(A, new Pair(0, 0)).dia;
    }

    public Pair diameter(TreeNode root, Pair pair) {
        if(root == null) return new Pair(0, 0);
        Pair left = diameter(root.left, pair);
        Pair right = diameter(root.right, pair);
        int height = Integer.max(left.height, right.height) + 1;
        int dia = Integer.max(Integer.max(left.height + right.height, left.dia), right.dia);
        return new Pair(height, dia);
    }

}
