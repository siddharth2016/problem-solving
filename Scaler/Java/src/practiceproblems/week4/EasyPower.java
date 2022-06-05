package practiceproblems.week4;

import java.util.Scanner;

public class EasyPower {

    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int res = 1;
        for(int i=0; i<B; i++) {
            res = ((res % 1000000000) * (A % 1000000000)) % 1000000000;
        }
        System.out.println(res);
    }

}
