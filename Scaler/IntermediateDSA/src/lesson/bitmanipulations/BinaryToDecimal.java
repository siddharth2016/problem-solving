package lesson.bitmanipulations;

import java.util.Scanner;

public class BinaryToDecimal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int ans = 0;
        int pow = 1;
        while(N > 0) {
            ans += (N%10) * pow;
            pow *= 2;
            N /= 10;
        }
        System.out.println(ans);
    }

}
