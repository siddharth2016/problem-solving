package lesson.prefixsum;

import java.util.Scanner;

public class EvenPrefixSum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = scan.nextInt();
        }
        int[] evenPrefixSum = new int[n];
        evenPrefixSum[0] = arr[0];
        for(int i=1; i<n; i++) {
            if(i % 2 == 0) evenPrefixSum[i] = evenPrefixSum[i-1] + arr[i];
            else evenPrefixSum[i] = evenPrefixSum[i-1];
        }

        for(int val : evenPrefixSum) {
            System.out.print(val + " ");
        }
    }
}
