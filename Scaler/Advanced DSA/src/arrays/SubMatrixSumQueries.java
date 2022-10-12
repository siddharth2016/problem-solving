package src.arrays;

import java.util.ArrayList;

public class SubMatrixSumQueries {

    public int[][] generatePrefixMat(ArrayList<ArrayList<Integer>> arr) {
        int mod = (int)Math.pow(10, 9) + 7;
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
                result[i][j] = (result[i][j]%mod + mod)%mod;
            }
        }

        return result;
    }

    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A, ArrayList<Integer> B, ArrayList<Integer> C, ArrayList<Integer> D, ArrayList<Integer> E) {
        ArrayList<Integer> result = new ArrayList<>();
        int[][] prefix = generatePrefixMat(A);
        int q = B.size();
        int mod = (int)Math.pow(10, 9) + 7;
        for(int i=0; i<q; i++) {
            int b = B.get(i) - 1;
            int c = C.get(i) - 1;
            int d = D.get(i) - 1;
            int e = E.get(i) - 1;
            int sum = 0;
            int upperRegion = 0;
            int leftRegion = 0;
            int midRegion = 0;
            if(b!=0) upperRegion = prefix[b-1][e];
            if(c!=0) leftRegion = prefix[d][c-1];
            if(b!=0 && c!=0) midRegion = prefix[b-1][c-1];
            sum = ((prefix[d][e] % mod - (
                    (upperRegion % mod + leftRegion % mod) % mod
            ) + mod) % mod + midRegion % mod) % mod;
            result.add(sum);
        }
        return result;
    }

}
