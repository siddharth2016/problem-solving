package src.dynamicprogramming;

public class MaximumSumValueBCD {

    public int solve(int[] A, int B, int C, int D) {
        int[][] mat = new int[3][A.length];
        for(int i=0; i<3; i++) {
            int maxVal = Integer.MIN_VALUE;
            for(int j=0; j<A.length; j++) {
                if(i == 0) {
                    mat[i][j] = Integer.max(maxVal, B * A[j]);
                    maxVal = mat[i][j];
                }
                else if(i == 1) {
                    mat[i][j] = Integer.max(maxVal, C * A[j] + mat[i-1][j]);
                    maxVal = mat[i][j];
                }
                else {
                    mat[i][j] = Integer.max(maxVal, D * A[j] + mat[i-1][j]);
                    maxVal = mat[i][j];
                }
            }
        }
        return mat[2][A.length-1];
    }

}
