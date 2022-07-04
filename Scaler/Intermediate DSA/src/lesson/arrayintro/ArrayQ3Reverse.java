package lesson.arrayintro;

import java.util.Scanner;

public class ArrayQ3Reverse {

    private static void reverseArray(int[] arr) {
        int i=0;
        int j= arr.length - 1;
        while(i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = scan.nextInt();
        }
        reverseArray(arr);
        for(int val: arr) {
            System.out.println(val);
        }
    }

}
