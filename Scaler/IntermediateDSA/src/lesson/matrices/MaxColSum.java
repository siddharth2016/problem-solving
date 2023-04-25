package lesson.matrices;

import java.util.Scanner;

public class MaxColSum {

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
        int maxColIndx = -1;
        int maxColSum = Integer.MIN_VALUE;
        for(int j=0; j<cols; j++) {
            int colSum = 0;
            for(int i=0; i<rows; i++) {
                colSum += mat[i][j];
            }
            if(colSum > maxColSum) {
                maxColSum = colSum;
                maxColIndx = j;
            }
        }
        System.out.println(maxColSum);
        System.out.println("Column with Max Col Sum: ");
        for(int i=0; i<rows; i++) {
            System.out.println(mat[i][maxColIndx]);
        }
    }

}
