package src.arrays;

import java.util.ArrayList;

public class MaximumSumSquareSubmatrix {

    public int[][] generatePrefixMat(ArrayList<ArrayList<Integer>> arr) {
        int rows = arr.size();
        int cols = arr.get(0).size();
        int[][] result = new int[rows][cols];

        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                int val = arr.get(i).get(j);
                if(i==0 && j==0) result[i][j] = val;
                else if(i==0 && j!=0) result[i][j] = result[i][j-1] + val;
                else if(i!=0 && j==0) result[i][j] = result[i-1][j] + val;
                else result[i][j] = val + result[i-1][j] + result[i][j-1] - result[i-1][j-1];
            }
        }

        return result;
    }

    public int solve(ArrayList<ArrayList<Integer>> A, int B) {
        int[][] prefix = generatePrefixMat(A);
        int maxSum = Integer.MIN_VALUE;
        int rows = A.size();
        int cols = A.get(0).size();
        for(int i=0; i<rows-B+1; i++) {
            for(int j=0; j<cols-B+1; j++) {
                int x = i + B - 1;
                int y = j + B - 1;
                int upperRegion = 0;
                int leftRegion = 0;
                int midRegion = 0;
                if(i!=0) upperRegion = prefix[i-1][y];
                if(j!=0) leftRegion = prefix[x][j-1];
                if(i!=0 && j!=0) midRegion = prefix[i-1][j-1];
                int sum = prefix[x][y] - upperRegion - leftRegion + midRegion;
                maxSum = Integer.max(maxSum, sum);
            }
        }
        return maxSum;
    }

}
