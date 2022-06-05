package practiceproblems.week4;

import java.util.Scanner;

public class DaysInMonth {

    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        if(num == 1 || num == 3 || num == 5 || num == 7 || num == 8 || num == 10 || num == 12) {
            System.out.println(31);
        }
        else if(num == 4 || num == 6 || num == 9 || num == 11) {
            System.out.println(30);
        }
        else System.out.println(28);
    }

}
