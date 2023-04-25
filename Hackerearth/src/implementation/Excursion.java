// https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/excursion-2d080f3a/

package src.implementation;

import java.util.Scanner;

public class Excursion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while(test--!=0) {
            double n = scanner.nextInt();
            double m = scanner.nextInt();
            double k = scanner.nextInt();
            System.out.println((int)(Math.ceil(n / k) + Math.ceil(m / k)));
        }
    }

}
