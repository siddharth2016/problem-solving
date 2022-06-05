package practiceproblems.week4;

import java.util.Scanner;

public class PrintMonth {

    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        if(num == 1) System.out.println("January");
        else if(num == 2) System.out.println("February");
        else if(num == 3) System.out.println("March");
        else if(num == 4) System.out.println("April");
        else if(num == 5) System.out.println("May");
        else if(num == 6) System.out.println("June");
        else if(num == 7) System.out.println("July");
        else if(num == 8) System.out.println("August");
        else if(num == 9) System.out.println("September");
        else if(num == 10) System.out.println("October");
        else if(num == 11) System.out.println("November");
        else System.out.println("December");
    }

}
