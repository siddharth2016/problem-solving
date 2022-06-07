package practiceproblems.week5.patterns;

import java.util.Scanner;

public class PrintNStars {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=0; i<n; i++) {
            System.out.print("*");
        }
    }

}
