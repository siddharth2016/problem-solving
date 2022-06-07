package practiceproblems.week5.patterns;

import java.util.Scanner;

public class NumericStairPattern {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j);
                if(j!=i) System.out.print(" ");
            }
            System.out.println();
        }
    }

}
