package lesson.bitmanipulations;

import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int res = 0;
        int pow = 1;
        while(N > 0) {
            res += (N%2) * pow;
            pow *= 10;
            N /= 2;
        }
        System.out.println(res);
    }

}
