package src.circuit;

import java.util.Scanner;

public class MazeMaximum {

    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt(); scan.nextLine();
        int[][] arr = new int[N][M];
        int[] minRowValues = new int[N];
        int[] minColValues = new int[M];
        int start = Integer.MAX_VALUE;
        int end = Integer.MIN_VALUE;
        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                arr[i][j] = scan.nextInt();
                start = Integer.min(start, arr[i][j]);
                end = Integer.max(end, arr[i][j]);
            }
            scan.nextLine();
        }
        updateMinRowValues(arr, minRowValues);
        updateMinColValues(arr, minColValues);
        int ans = 0;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            boolean exists = checkRowCol(mid, N, M, minRowValues, minColValues);
            if(exists) {
                ans = mid;
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        System.out.println(ans);
    }
    public static void updateMinRowValues(int[][] arr, int[] result) {
        for(int i=0; i<arr.length; i++) {
            int min = Integer.MAX_VALUE;
            for(int j=0; j<arr[0].length; j++) {
                min = Integer.min(min, arr[i][j]);
            }
            result[i] = min;
        }
    }


    public static void updateMinColValues(int[][] arr, int[] result) {
        for(int j=0; j<arr[0].length; j++) {
            int min = Integer.MAX_VALUE;
            for(int i=0; i<arr.length; i++) {
                min = Integer.min(min, arr[i][j]);
            }
            result[j] = min;
        }
    }

    public static boolean checkRowCol(int val, int rows, int cols, int[] minRowValues, int[] minColValues) {
        boolean foundRow = false;
        boolean foundCol = false;

        for(int i=0; i<rows; i++) {
            if(minRowValues[i] >= val) {
                foundRow = true;
                break;
            }
        }

        for(int j=0; j<cols; j++) {
            if(minColValues[j] >= val) {
                foundCol = true;
                break;
            }
        }

        return foundRow && foundCol;
    }

}
