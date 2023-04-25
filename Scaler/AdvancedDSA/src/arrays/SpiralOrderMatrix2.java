package src.arrays;

public class SpiralOrderMatrix2 {

    public int[][] generateMatrix(int A) {
        int startRow = 0;
        int startCol = 0;
        int endRow = A-1;
        int endCol = A-1;

        int num = 1;
        int[][] result = new int[A][A];
        while(num <= A*A) {

            for(int i=startCol; i<=endCol; i++) {
                result[startRow][i] = num;
                num++;
            }
            startRow++;

            for(int i=startRow; i<=endRow; i++) {
                result[i][endCol] = num;
                num++;
            }
            endCol--;

            for(int i=endCol; i>=startCol; i--) {
                result[endRow][i] = num;
                num++;
            }
            endRow--;

            for(int i=endRow; i>=startRow; i--) {
                result[i][startCol] = num;
                num++;
            }
            startCol++;
        }

        return result;
    }

}
