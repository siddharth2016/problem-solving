package lesson.bitmanipulations;

import java.util.Scanner;

public class UniqueElement {


    private static void printUniqueElement(int[] arr, int n) {
        int unique = 0;
        for(int elem : arr) {
            unique ^= elem;
        }
        System.out.println(unique);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = scan.nextInt();
        }
        printUniqueElement(arr, N);
    }

}
