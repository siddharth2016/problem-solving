import java.util.Scanner;

public class InvertedHeartPattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Value of N: ");
        int n = scanner.nextInt(); scanner.nextLine();

        printPattern(n);
    }

    private static void printPattern(int n) {
        int i, j;

        for (i=0; i<n; i++) {
            for (j=0; j<2*n-1; j++) {
                if(n-1-i<=j && j<=n-1+i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }

        for (i=n-2; i>=n/2; i-=2) {
            for (j=0; j<(n-i)/2; j++) System.out.print(" ");
            for (j=0; j<i; j++) System.out.print("*");
            for (j=0; j<n-i; j++) System.out.print(" ");
            for (j=0; j<i-1; j++) System.out.print("*");
            System.out.println();
        }
    }
}

/*

Enter Value of N:
15
              *
             ***
            *****
           *******
          *********
         ***********
        *************
       ***************
      *****************
     *******************
    *********************
   ***********************
  *************************
 ***************************
*****************************
 *************  ************
  ***********    **********
   *********      ********
    *******        ******

 */