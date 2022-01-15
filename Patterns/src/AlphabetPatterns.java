import java.util.Scanner;

public class AlphabetPatterns {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Value of N: ");
        int N = scanner.nextInt(); scanner.nextLine();

        pattern1(N);
        pattern2(N);
        pattern3(N);
        pattern4(N);
        pattern5(N);
        pattern6(N);

    }

    public static void pattern1(int n) {
        System.out.println("\nPattern 1\n");
        /*

        N - 5
        A B C D E
        B C D E
        C D E
        D E
        E

         */

        for (int i=0; i<n; i++) {
            for (int j=i; j<n; j++) {
                System.out.print((char) (65+j) + " ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        System.out.println("\nPattern 2\n");

        /*

        N - 5
        E E E E E
        D D D D
        C C C
        B B
        A

         */

        for (int i=0; i<n; i++) {
            for (int j=n-1; j>=i; j--) {
                System.out.print((char) (65 + (n-1-i)) + " ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n) {
        System.out.println("\nPattern 3\n");

        /*

        N - 5
        A
        A B
        A B C
        A B C D
        A B C D E

         */

        for (int i=0; i<n; i++) {
            for (int j=0; j<i+1; j++) {
                System.out.print((char) (65+j) + " ");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n) {
        System.out.println("\nPattern 4\n");

        /*

        N - 5
        E
        D E
        C D E
        B C D E
        A B C D E

         */

        for (int i=0; i<n; i++) {
            for (int j=n-1-i; j<n; j++) {
                System.out.print((char) (65+j) + " ");
            }
            System.out.println();
        }
    }

    public static void pattern5(int n) {
        System.out.println("\nPattern 5\n");

        /*

        N - 5
        A A A A A
        B B B B
        C C C
        D D
        E

         */

        for (int i=0; i<n; i++) {
            for (int j=i; j<n; j++) {
                System.out.print((char) (65+i) + " ");
            }
            System.out.println();
        }
    }

    public static void pattern6(int n) {
        System.out.println("\nPattern 6\n");

        /*

        N - 5
        A
        B A
        C B A
        D C B A
        E D C B A

         */

        for (int i=0; i<n; i++) {
            for (int j=0; j<i+1; j++) {
                System.out.print((char) (65+i-j) + " ");
            }
            System.out.println();
        }
    }

}
