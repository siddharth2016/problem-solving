package practiceproblems.week5;

import java.util.Scanner;

public class FirstVsLast {

    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while(test--!=0) {
            int N = scan.nextInt();
            int last = N%10;
            while(N>9) {
                N = N / 10;
            }
            System.out.println(N + " " + last);
        }
        scan.close();
    }
}
