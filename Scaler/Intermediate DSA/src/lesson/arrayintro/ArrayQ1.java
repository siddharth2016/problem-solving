package lesson.arrayintro;

import java.util.Scanner;

public class ArrayQ1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }

        int count = 0;
        int currElem = arr[0];

        for(int i=1; i<n; i++) {
            if(currElem < arr[i]) {
                count++;
                currElem = arr[i];
            }
            else if(currElem > arr[i]) {
                count++;
            }
        }

        System.out.println(count);
    }

}
