package src.binarysearch;

public class MatrixSearch {

    public int findRowNum(int[][] A, int B, int rows, int cols) {
        int i = 0;
        for(i=0; i<rows; i++) {
            if(A[i][0] <= B && B <= A[i][cols-1]) break;
        }
        return i;
    }

    public int binarySearch(int[] arr, int target) {
        int s = 0;
        int e = arr.length-1;
        while(s <= e) {
            int mid = s + (e-s)/2;

            if(arr[mid] == target) return mid;

            if(arr[mid] < target) s = mid + 1;
            else e = mid - 1;
        }
        return -1;
    }

    public int searchMatrix(int[][] A, int B) {
        int rows = A.length;
        int cols = A[0].length;
        int result = -1;
        int rowNum = findRowNum(A, B, rows, cols);
        if(rowNum != rows) result = binarySearch(A[rowNum], B);
        return result == -1 ? 0 : 1;
    }

}
