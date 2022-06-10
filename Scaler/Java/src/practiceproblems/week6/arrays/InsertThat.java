package practiceproblems.week6.arrays;

import java.util.Scanner;

public class InsertThat {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n+1];
        for(int i=0; i<n; i++) {
            arr[i] = scan.nextInt();
        }
        int x = scan.nextInt();
        int y = scan.nextInt();
        for(int i=n-1; i>=x-1; i--) {
            arr[i+1] = arr[i];
        }
        arr[x-1] = y;
        for(int i=0; i<=n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
