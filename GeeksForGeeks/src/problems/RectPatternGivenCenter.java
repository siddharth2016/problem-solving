package src.problems;

import java.util.Scanner;

public class RectPatternGivenCenter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Value of N: ");
        int n = scanner.nextInt(); scanner.nextLine();
        System.out.println("Enter Value of C1: ");
        int c1 = scanner.nextInt(); scanner.nextLine();
        System.out.println("Enter Value of C2: ");
        int c2 = scanner.nextInt(); scanner.nextLine();

        printPattern(c1, c2, n);
    }

    private static void printPattern(int c1, int c2, int n) {
        int i, j;
        for (i=0; i<n; i++) {
            for (j=0; j<n; j++) {
                int value = Math.max(Math.abs(i-c1), Math.abs((j-c2)));
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

/*

Enter Value of N:
7
Enter Value of C1:
3
Enter Value of C2:
4
4 3 3 3 3 3 3
4 3 2 2 2 2 2
4 3 2 1 1 1 2
4 3 2 1 0 1 2
4 3 2 1 1 1 2
4 3 2 2 2 2 2
4 3 3 3 3 3 3

 */
