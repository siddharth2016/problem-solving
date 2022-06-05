package practiceproblems.week4;

import java.util.Scanner;

public class ProfitOrLoss {

    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scan = new Scanner(System.in);
        int C = scan.nextInt();
        int S = scan.nextInt();
        System.out.println(C < S ? 1 : -1);
        System.out.println(Math.abs(S - C));
        scan.close();
    }

}
