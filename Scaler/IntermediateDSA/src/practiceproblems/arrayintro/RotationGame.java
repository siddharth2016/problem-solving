package practiceproblems.arrayintro;

import java.util.Scanner;

public class RotationGame {

    private static void reverseArray(int[] arr, int left, int right) {
        while(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++; right--;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = scan.nextInt();
        }
        int b = scan.nextInt();
        reverseArray(arr, 0, n-1);
        reverseArray(arr, 0, b % n - 1);
        reverseArray(arr, b % n, n-1);
        for(int val: arr) {
            System.out.print(val + " ");
        }
    }

}
