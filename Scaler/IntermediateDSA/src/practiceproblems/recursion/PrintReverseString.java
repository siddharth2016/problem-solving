package practiceproblems.recursion;

import java.util.Scanner;

public class PrintReverseString {

    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println(reverse(input, input.length()-1));
    }

    public static String reverse(String input, int indx) {
        if(indx < 0) return "";
        return input.charAt(indx) + reverse(input, indx-1);
    }

}
