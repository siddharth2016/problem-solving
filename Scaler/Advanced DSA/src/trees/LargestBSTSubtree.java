package src.trees;

public class LargestBSTSubtree {

    class Pair{
        boolean valid;
        int min;
        int max;
        int size;

        Pair(boolean valid, int size, int min, int max){
            this.valid = valid;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }

    public int solve(TreeNode A) {
        Pair pair = this.process(A);
        return pair.size;
    }

    public Pair process(TreeNode node){
        if(node == null){
            return new Pair(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        boolean valid = true;
        Pair left = process(node.left);
        Pair right = process(node.right);

        if((left.valid == true) && (right.valid == true)){
            if((node.val <= left.max) || (node.val >= right.min)){
                valid = false;
            }
        }else{
            valid = false;
        }

        int min = java.lang.Math.min(node.val, java.lang.Math.min(left.min, right.min));
        int max = java.lang.Math.max(node.val, java.lang.Math.max(left.max, right.max));

        if(valid == true){
            return new Pair(valid, left.size + right.size + 1, min, max);
        }
        return new Pair(valid, java.lang.Math.max(left.size , right.size), min, max);
    }

}
