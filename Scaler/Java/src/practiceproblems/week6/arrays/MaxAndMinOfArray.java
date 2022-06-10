package practiceproblems.week6.arrays;

import java.util.Scanner;

public class MaxAndMinOfArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = scan.nextInt();
        }
        int max = -1;
        int min = 10001;
        for(int i=0; i<n; i++) {
            if(arr[i] < min) min = arr[i];

            if(arr[i] > max) max = arr[i];
        }
        System.out.println(max + " " + min);
    }

}
