package src.trees;

public class CheckForBSTWithOneChild {

    public String solve(int[] A) {
        int lowRange = Integer.MIN_VALUE;
        int highRange = Integer.MAX_VALUE;
        int root = A[0];
        for(int i=1; i<A.length; i++) {
            if(A[i] > root) {
                lowRange = root;
            }
            else {
                highRange = root;
            }
            if(A[i] < lowRange || A[i] > highRange) return "NO";
            root = A[i];
        }
        return "YES";
    }

}
