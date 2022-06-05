package practiceproblems.week4;

import java.util.Scanner;

public class WhichTriangle {

    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();

        if(A == B && A == C) System.out.println("equilateral");
        else if(A == B || A == C || B == C) System.out.println("isosceles");
        else System.out.println("scalene");

        scan.close();
    }

}
