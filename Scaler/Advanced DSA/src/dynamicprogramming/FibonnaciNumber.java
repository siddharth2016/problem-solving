package src.dynamicprogramming;

import java.util.Scanner;

public class FibonnaciNumber {

    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int[] dp = new int[A+1];
        for(int i=0; i<=A; i++) {
            if(i == 0) dp[i] = 0;
            else if(i == 1) dp[i] = 1;
            else dp[i] = dp[i-1] + dp[i-2];
        }
        System.out.println(dp[A]);
    }

}
