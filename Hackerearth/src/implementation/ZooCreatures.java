// https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/tin-and-creatures-2f60b404/

package src.implementation;

import java.util.Scanner;

public class ZooCreatures {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long testCases = scanner.nextLong();
        while(testCases--!=0) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long lcm = getLCM(a, b);
            System.out.println(lcm / a + " " + lcm / b);
        }
    }

    static long getLCM(long a, long b) {
        return (a * b) / getGCD(a, b);
    }

    static long getGCD(long a, long b) {
        if (a == 0) return b;
        return getGCD(b % a, a);
    }

}
