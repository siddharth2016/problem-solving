package src.topinterview150;

public class LC_48_RotateImageInPlace {

    public void rotate(int[][] matrix) {
        createTranspose(matrix, matrix.length, matrix.length);
        reverseRows(matrix, matrix.length, matrix.length);
    }

    public void createTranspose(int[][] mat, int rows, int cols) {
        for(int i=0; i<rows; i++) {
            for(int j=0; j<i; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }

    public void reverseRows(int[][] mat, int rows, int cols) {
        for(int i=0; i<rows; i++) {
            reverse(mat[i], 0, cols-1);
        }
    }

    public void reverse(int[] arr, int i, int j) {
        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }
    }

}
