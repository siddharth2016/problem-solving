package practiceproblems.week4;

import java.util.Scanner;

public class DivBy2Num {

    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        System.out.println(A % 55 == 0 ? 1 : 0);
    }

}
