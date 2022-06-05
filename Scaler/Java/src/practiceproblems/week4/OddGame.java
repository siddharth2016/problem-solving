package practiceproblems.week4;

import java.util.Scanner;

public class OddGame {

    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for(int i=1; i<=N; i+=2) {
            System.out.print(i + " ");
        }
    }

}
