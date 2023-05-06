import java.util.Scanner;

public class HollowDiamondPattern2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Value of N: ");
        int n = scanner.nextInt(); scanner.nextLine();

        printPattern(n);
    }

    private static void printPattern(int n) {
        int i, j;

        for (i=0; i<n; i++) {
            for (j=0; j<=i; j++) {
                if (j==i) System.out.print("*");
                else System.out.print("* ");
            }
            for (j=2*(n-1); j>=2*i; j--) System.out.print("  ");
            for (j=0; j<=i; j++) {
                if (j==i) System.out.print("*");
                else System.out.print("* ");
            }
            System.out.println();
        }

        for (i=0; i<n; i++) {
            for (j=i; j<n; j++) {
                if (j==n-1) System.out.print("*");
                else System.out.print("* ");
            }
            for (j=0; j<=2*i; j++) System.out.print("  ");
            for (j=i; j<n; j++) {
                if (j==n-1) System.out.print("*");
                else System.out.print("* ");
            }
            System.out.println();
        }
    }
}


/*

Enter Value of N:
5
*                  *
* *              * *
* * *          * * *
* * * *      * * * *
* * * * *  * * * * *
* * * * *  * * * * *
* * * *      * * * *
* * *          * * *
* *              * *
*                  *

 */