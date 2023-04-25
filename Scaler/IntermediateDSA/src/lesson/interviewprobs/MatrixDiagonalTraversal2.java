package lesson.interviewprobs;

import java.util.Scanner;

public class MatrixDiagonalTraversal2 {


    private static void diagonalTraversal2(int[][] mat, int rows, int cols) {
        for(int j=0; j<cols; j++) {
            int x = 0;
            int y = j;
            while(x<rows && y>=0) {
                System.out.print(mat[x][y] + " ");
                x++; y--;
            }
            System.out.println();
        }

        for(int i=1; i<rows; i++) {
            int x = i;
            int y = cols-1;
            while(x<rows && y>=0) {
                System.out.print(mat[x][y] + " ");
                x++; y--;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] mat = new int[n][m];
        for(int i=0; i<n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = scan.nextInt();
            }
        }
        diagonalTraversal2(mat, n, m);
    }

}

/*

1 2 3 4
5 6 7 8
9 10 11 12

1
2 5
3 6 9
4 7 10
8 11
12
 */
