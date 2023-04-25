package practiceproblems.modulararithmetic;

import java.util.Scanner;

public class LeastCommonMultiple {

    private static int getGCD(int a, int b) {
        if(a == 0) return b;
        else return getGCD(b % a, a);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while(test--!=0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int gcd = getGCD(a, b);
            System.out.println((a * b) / gcd);
        }
    }

}
