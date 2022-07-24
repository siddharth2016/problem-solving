package lesson.bitmanipulations;

import java.util.Scanner;

public class SwapBitOfNumber {

    private static int createMask(int i, int j) {
        return ((~0)<<(i+1)) | ((1<<j) - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int i = scan.nextInt();
        int j = scan.nextInt();
        int M = scan.nextInt();
        int mask = createMask(i, j);
        System.out.println((N & mask) | (M<<j));
    }

}
