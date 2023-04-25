package practiceproblems.interviewprobs;

import java.util.Scanner;

public class StarHollowDiamondPattern {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i+1; j++) System.out.print("*");
            for(int j=1; j<=2*(i-1); j++) System.out.print(" ");
            for(int j=1; j<=n-i+1; j++) System.out.print("*");
            System.out.println();
        }

        for(int i=n; i>=1; i--) {
            for(int j=1; j<=n-i+1; j++) System.out.print("*");
            for(int j=1; j<=2*(i-1); j++) System.out.print(" ");
            for(int j=1; j<=n-i+1; j++) System.out.print("*");
            System.out.println();
        }
    }

}
