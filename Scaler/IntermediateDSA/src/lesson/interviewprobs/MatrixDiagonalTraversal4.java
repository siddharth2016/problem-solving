package lesson.interviewprobs;

import java.util.Scanner;

public class MatrixDiagonalTraversal4 {

    private static void diagonalTraversal4(int[][] mat, int rows, int cols) {
        for(int j=cols-1; j>=0; j--) {
            int x = rows-1;
            int y = j;
            while(x>=0 && y<cols) {
                System.out.print(mat[x][y] + " ");
                x--; y++;
            }
            System.out.println();
        }

        for(int i=rows-2; i>=0; i--) {
            int x = i;
            int y = 0;
            while(x>=0 && y<cols) {
                System.out.print(mat[x][y] + " ");
                x--; y++;
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
        diagonalTraversal4(mat, n, m);
    }

}


/*

1 2 3 4
5 6 7 8
9 10 11 12

12
11 8
10 7 4
9 6 3
5 2
1

 */