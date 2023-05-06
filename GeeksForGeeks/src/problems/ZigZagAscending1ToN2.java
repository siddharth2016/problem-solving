package src.problems;

import java.util.Scanner;

public class ZigZagAscending1ToN2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Value of N: ");
        int n = scanner.nextInt(); scanner.nextLine();

        int[][] arr = doZigZagAscending(n);

        printArray(arr, n);
    }

    private static int[][] doZigZagAscending(int n) {

        int i, j;

        int[][] arr = new int[n][n];

        arr[0][0] = 1;

        for (i=0; i<n; i++) {
            for (j=1; j<n-i; j++) {
                if (i==0) {
                    arr[j][i] = arr[j-1][i] + j + 1;
                }
                arr[i][j] = arr[i][j-1] + i + j;
            }
        }

        arr[1][n-1] = arr[n-1][0] + 1;
        int step;

        for (i=2; i<n; i++) {
            step = n - 2;
            for (j=n-i; j<n; j++) {
                if (j==n-i) {
                    arr[i][j] = arr[i-1][j+1] + 1;
                }
                else {
                    arr[i][j] = arr[i][j-1] + step;
                    step--;
                }
            }
        }
        return arr;
    }

    private static void printArray(int[][] array, int n) {
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*

Enter Value of N:
6
1 2 4 7 11 16
3 5 8 12 17 22
6 9 13 18 23 27
10 14 19 24 28 31
15 20 25 29 32 34
21 26 30 33 35 36

 */