package practiceproblems.week5;

import java.util.Scanner;

public class SumOfOdds {

    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int n = A % 2 == 0 ? A/2 : (A+1)/2;
        System.out.println(n * n);
    }

}
