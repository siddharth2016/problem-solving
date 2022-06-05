package practiceproblems.week5;

import java.util.Scanner;

public class SumTheDigits {

    private static void sumOfDigits(int N) {
        int sum = 0;
        while(N>0) {
            sum += N % 10;
            N /= 10;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while(test--!=0) {
            int A = scan.nextInt();
            sumOfDigits(A);
        }
    }

}
