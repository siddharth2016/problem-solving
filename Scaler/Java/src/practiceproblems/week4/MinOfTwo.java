package practiceproblems.week4;

import java.util.Scanner;

public class MinOfTwo {

    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        if(A >= B) System.out.println(B);
        else System.out.println(A);
        scan.close();
    }

}
