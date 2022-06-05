package practiceproblems.week5;

import java.util.Scanner;

public class FromTopToDown {

    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();
        for(int i=1; i<=N; i++) {
            System.out.print(i + " ");
        }
    }

}
