package src.problems;

import java.util.ArrayList;
import java.util.Scanner;

public class DiagonalZigzagTraversal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Value of Rows: ");
        int rows = scanner.nextInt(); scanner.nextLine();
        System.out.println("Enter Value of Cols: ");
        int cols = scanner.nextInt(); scanner.nextLine();

        int[][] arr = new int[rows][cols];
        System.out.println("Enter Values of Matrix: ");
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                arr[i][j] = scanner.nextInt(); scanner.nextLine();
            }
        }

        diagonalTraversal(arr, rows, cols);
    }

    private static void diagonalTraversal(int[][] arr, int rows, int cols) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for (int i=0; i<rows+cols-1; i++) {
            result.add(new ArrayList<>());
        }

        for (int i=0; i<cols; i++) {
            for (int j=0; j<rows; j++) {
                (result.get(i+j)).add(arr[j][i]);
            }
        }

        for (int i=0; i<rows+cols-1; i++) {
            ArrayList<Integer> internalArrayList = result.get(i);
            for (Integer integer : internalArrayList) {
                System.out.print(integer);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

/*

Enter Value of Rows:
5
Enter Value of Cols:
4
Enter Values of Matrix:
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20

OUTPUT-

1
5 2
9 6 3
13 10 7 4
17 14 11 8
18 15 12
19 16
20

 */
