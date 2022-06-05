package practiceproblems.week5;

import java.util.Scanner;

public class CountTheDigits {

    private static int countDigits(int n) {
        int count = 0;
        while(n>9) {
            n = n / 10;
            count++;
        }
        return ++count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while(test--!=0) {
            int n = scan.nextInt();
            System.out.println(countDigits(n));
        }
    }

}
