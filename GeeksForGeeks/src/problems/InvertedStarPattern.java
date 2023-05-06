package src.problems;

import java.util.Scanner;

public class InvertedStarPattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Value of N: ");
        int n = scanner.nextInt(); scanner.nextLine();

        printPattern(n);
    }

    private static void printPattern(int n) {
        int i, j;
        for (i=0; i<n; i++) {
            for (j=0; j<n; j++) {
                if (j>=i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}

/*

Enter Value of N:
5
*****
 ****
  ***
   **
    *

 */
