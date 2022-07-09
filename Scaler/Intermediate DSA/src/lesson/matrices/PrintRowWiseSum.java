package lesson.matrices;

import java.util.Scanner;

public class PrintRowWiseSum {

    private static void printRowWiseSum(int[][] mat, int rows, int cols) {
        for(int i=0; i<rows; i++) {
            int rowSum = 0;
            for(int j=0; j<cols; j++) {
                rowSum += mat[i][j];
            }
            System.out.println("Sum of Row " + (i+1) + " is " + rowSum);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        int cols = scan.nextInt();
        int[][] mat = new int[rows][cols];
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                mat[i][j] = scan.nextInt();
            }
        }

        printRowWiseSum(mat, rows, cols);
    }

}
