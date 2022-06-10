package practiceproblems.week6.arrays;

import java.util.Scanner;

public class NegativeIntegers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = scan.nextInt();
        }
        for(int i=0; i<n; i++) {
            if(arr[i] < 0) System.out.print(arr[i] + " ");
        }
    }

}
