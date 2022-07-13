package practiceproblems.matrices;

import java.util.ArrayList;

public class SpiralOrderMatrix {

    public ArrayList<ArrayList<Integer>> generateMatrix(int A) {
        int[][] arr = new int[A][A];
        int currNum = 1;
        int startCol = 0, endCol = A-1;
        int startRow = 0, endRow = A-1;
        while(currNum <= A * A) {
            for(int j=startCol; j<=endCol; j++) arr[startRow][j] = currNum++;
            startRow++;
            if(currNum > A * A) break;
            for(int i=startRow; i<=endRow; i++) {
                arr[i][endCol] = currNum++;
            }
            endCol--;
            if(currNum > A * A) break;
            for(int j=endCol; j>=startCol; j--) arr[endRow][j] = currNum++;
            endRow--;
            if(currNum > A * A) break;
            for(int i=endRow; i>=startRow; i--) arr[i][startCol] = currNum++;
            startCol++;
            if(currNum > A * A) break;
        }

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for(int i=0; i<A; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0; j<A; j++) {
                temp.add(arr[i][j]);
            }
            result.add(temp);
        }

        return result;
    }

}
