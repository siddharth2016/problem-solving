package practiceproblems.week5;

import java.util.Scanner;

public class PrintThePrimes {

    private static boolean checkPrime(int n) {
        boolean prime = n != 1;
        for(int i=2; i<=n/2; i++) {
            if(n % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for(int i=1; i<=N; i++) {
            if(checkPrime(i)) {
                System.out.println(i);
            }
        }
        scan.close();
    }

}
