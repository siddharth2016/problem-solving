package practiceproblems.week5;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        scan.close();
        for(int i=1; i<=10; i++) {
            System.out.println(A + " * " + i + " = " + A * i);
        }
    }

}
