package src.dynamicprogramming;

import java.util.Arrays;

public class MaxRectangleInBinaryMatrix {

    public int maximalRectangle(int[][] A){

        int n = A.length;
        int m = A[0].length;

        int[] nsr = new int[m]; // next smaller index in right
        int[] nsl = new int[m]; // next smaller index in left
        int[] height = new int[m];

        Arrays.fill(nsl, -1);
        Arrays.fill(nsr, m);

        int maxArea = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            //updating height
            for(int j = 0; j < m; j++){

                if(A[i][j] == 1){
                    height[j]++;
                }else{
                    height[j] = 0;
                }
            }

            //updating left index array
            int leftBoundery = -1;
            for(int j = 0; j < m; j++){

                if(A[i][j] == 1){
                    nsl[j] = Math.max(nsl[j], leftBoundery);
                }else{
                    nsl[j] = -1;
                    leftBoundery = j;
                }
            }

            //updating right index array
            int rightBoundery = m;
            for(int j = m - 1; j >= 0; j--){

                if(A[i][j] == 1){
                    nsr[j] = Math.min(nsr[j], rightBoundery);
                }else{
                    nsr[j] = m;
                    rightBoundery = j;
                }
            }

            // calculating area
            for(int j = 0; j < m; j++){
                maxArea = Math.max(maxArea, (nsr[j] - nsl[j] -1) * height[j]);
            }
        }
        return maxArea;
    }
}
