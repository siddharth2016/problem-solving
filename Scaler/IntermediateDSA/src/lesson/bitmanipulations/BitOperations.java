package lesson.bitmanipulations;

import java.util.Scanner;

public class BitOperations {


    private static int checkBit(int i, int n) {
        return (n>>i) & 1;
    }

    private static int generateNumber(int x, int y) {
        return (1<<x) | (1<<y);
    }

    private static int setBit(int i, int n) {
        return n | (1<<i);
    }

    private static int clearBit(int i, int n) {
        return n & (~(1<<i));
    }

    private static int updateBit(int i, int n, int val) {
        if(val == 1) return setBit(i, n);
        else return clearBit(i, n);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.println(checkBit(3, n));
        System.out.println(generateNumber(3, 4));
        System.out.println(setBit(3, n));
        System.out.println(clearBit(3, n));
        System.out.println(updateBit(3, n, 1));
    }

}
