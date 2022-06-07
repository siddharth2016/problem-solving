package practiceproblems.week6.patterns;

import java.util.Scanner;

public class PatternPrinting2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) System.out.print("*");
            for(int j=0; j<(n-i)*2; j++) System.out.print(" ");
            for(int j=1; j<=i; j++) System.out.print("*");
            System.out.println();
        }
    }

}
