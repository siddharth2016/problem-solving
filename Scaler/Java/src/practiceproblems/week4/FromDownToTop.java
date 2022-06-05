package practiceproblems.week4;

import java.util.Scanner;

public class FromDownToTop {

    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for(int i=N; i>0; i--) {
            System.out.print(i + " ");
        }
    }

}
