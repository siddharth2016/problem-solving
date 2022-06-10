package practiceproblems.week6.arrays;

import java.util.Scanner;

public class EvenOddElements {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while(test--!=0) {
            int n = scan.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++) {
                arr[i] = scan.nextInt();
            }
            int countEven = 0;
            int countOdd = 0;
            for(int i=0; i<n; i++) {
                if(arr[i] % 2 == 0) countEven++;
                else countOdd++;
            }
            System.out.println(Math.abs(countEven - countOdd));
        }
    }

}
