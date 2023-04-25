package practiceproblems.arrayintro;

import java.util.Scanner;

public class SeparateOddEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while(test--!=0) {
            int n = scan.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++) {
                arr[i] = scan.nextInt();
            }
            for(int val: arr) {
                if(val % 2 == 1) System.out.print(val + " ");
            }
            System.out.println();
            for(int val: arr) {
                if(val % 2 == 0) System.out.print(val + " ");
            }
            System.out.println();
        }
    }

}
