package practiceproblems.week5;

import java.util.Scanner;

public class HCFUsingLoops {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while(test--!=0) {
            int A = scan.nextInt();
            int B = scan.nextInt();
            while(A!=0) {
                int temp = A;
                A = B % A;
                B = temp;
            }
            System.out.println(B);
        }
    }

}
