package practiceproblems.week5;

import java.util.Scanner;

public class FindLCM {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long A = scan.nextLong();
        long B = scan.nextLong();
        long min = Math.min(A, B);
        long max = Math.max(A, B);
        for(int i = 1; i<=min; i++) {
            if((max * i) % min == 0) {
                System.out.println(max * i);
                break;
            }
        }
    }

}
