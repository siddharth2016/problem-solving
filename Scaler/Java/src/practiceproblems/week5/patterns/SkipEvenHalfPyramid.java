package practiceproblems.week5.patterns;

import java.util.Scanner;

public class SkipEvenHalfPyramid {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                if(j % 2 == 0) System.out.print(" ");
                else System.out.print(j);
            }
            System.out.println();
        }
    }

}
