package practiceproblems.week5.patterns;

import java.util.Scanner;

public class Pattern20828 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=1; i<=n; i++) {
            for(int j=1; j<i; j++) {
                System.out.print(" ");
            }
            for(int j=i; j<=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
