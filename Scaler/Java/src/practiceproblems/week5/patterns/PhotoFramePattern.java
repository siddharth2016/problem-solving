package practiceproblems.week5.patterns;

import java.util.Scanner;

public class PhotoFramePattern {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=1; i<=n; i++) {
            if(i==1 || i==n) {
                for(int j=1; j<=n; j++) System.out.print("*");
            }
            else {
                System.out.print("*");
                for(int j=1; j<n-1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
