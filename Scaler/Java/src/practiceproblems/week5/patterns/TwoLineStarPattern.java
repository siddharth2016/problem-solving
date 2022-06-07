package practiceproblems.week5.patterns;

import java.util.Scanner;

public class TwoLineStarPattern {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=1; i<=n; i++) {
            System.out.print("*");
            for(int j=1; j<=n-2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }

}
