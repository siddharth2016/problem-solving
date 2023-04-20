import java.util.Scanner;

public class DiamondPattern {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Value for N: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i=0; i<n; i++) {
            for (int j=0; j<(2*n-1); j++) {
                if ((n-1-i)<=j && j<=(n-1+i)) {
                    if ((i%2 == 0 && j%2 == 0) ||
                            (i%2 == 1 && j%2 == 1)) {
                        System.out.print("*");
                    }
                    else System.out.print(" ");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }

        for (int i=n-1; i>-1; i--) {
            for (int j=2*(n-1); j>-1; j--) {
                if ((n-1-i)<=j && j<=(n-1+i)) {
                    if ((i%2 == 0 && j%2 == 0) ||
                            (i%2 == 1 && j%2 == 1)) {
                        System.out.print("*");
                    }
                    else System.out.print(" ");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}


/*

N - 5

    *
   * *
  * * *
 * * * *
* * * * *
* * * * *
 * * * *
  * * *
   * *
    *

 */