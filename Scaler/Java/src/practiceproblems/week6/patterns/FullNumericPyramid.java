package practiceproblems.week6.patterns;

import java.util.Scanner;

public class FullNumericPyramid {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=1; i<=n; i++) {
            for(int j=i; j<n; j++) System.out.print("0 ");
            for(int j=i; j<i*2; j++) System.out.print(j + " ");
            for(int j=i*2-2; j>=i; j--) System.out.print(j + " ");
            for(int j=i; j<n; j++) System.out.print("0 ");
            System.out.println();
        }
    }

}
