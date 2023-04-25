// https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/recursive-sums/

package src.implementation;

import java.util.Scanner;

public class RecursiveSums {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        while(testCases--!=0) {
            long totalSum = 0;
            int m = scanner.nextInt();
            while(m--!=0) {
                long l = scanner.nextLong();
                long d = scanner.nextLong();
                long num = l * d;
                while (num > 0) {
                    totalSum += num % 10;
                    num = num / 10;
                }
                while (totalSum > 9) {
                    long temp = totalSum;
                    totalSum = temp / 10 + temp % 10;
                }
            }
            System.out.println(totalSum);
        }
    }

}
