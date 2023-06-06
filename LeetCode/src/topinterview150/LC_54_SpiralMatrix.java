package src.topinterview150;

import java.util.ArrayList;
import java.util.List;

public class LC_54_SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        int startRow = 0;
        int endRow = matrix.length-1;
        int startCol = 0;
        int endCol = matrix[0].length-1;
        List<Integer> result = new ArrayList<>();
        while(startRow <= endRow && startCol <= endCol) {

            for(int i=startCol; i<=endCol; i++) {
                result.add(matrix[startRow][i]);
            }
            startRow++;
            if(startRow > endRow) break;

            for(int i=startRow; i<=endRow; i++) {
                result.add(matrix[i][endCol]);
            }
            endCol--;
            if(startCol > endCol) break;

            for(int i=endCol; i>=startCol; i--) {
                result.add(matrix[endRow][i]);
            }
            endRow--;

            for(int i=endRow; i>=startRow; i--) {
                result.add(matrix[i][startCol]);
            }
            startCol++;

        }

        return result;
    }

}
