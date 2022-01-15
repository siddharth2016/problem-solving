import java.util.Scanner;

public class PascalTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Value of N: ");
        long N = scanner.nextInt(); scanner.nextLine();

//        for (int i=0; i<N; i++) {
//            for (int j=0; j<N-i; j++) System.out.print(" ");
//            for (int j=0; j<=i; j++) {
//                System.out.print(fact(i) / (fact(i-j) * fact(j)));
//                System.out.print(" ");
//            }
//            System.out.println();
//        }

        for (int i=1; i<N+1; i++) {
            for (int j=0; j<N-i; j++) System.out.print(" ");
            long C = 1;
            for (int j=1; j<i+1; j++) {
                System.out.print(C);
                System.out.print(" ");
                C = (C * (i-j))/j;
            }
            System.out.println();
        }

    }

    public static long fact(long n) {
        long res = 1;
        for (long i=2; i<=n; i++) {
            res *= i;
        }
        return res;
    }
}

/*

N - 5

    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1


 */
