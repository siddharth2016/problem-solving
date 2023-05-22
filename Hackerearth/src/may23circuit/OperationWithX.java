package src.may23circuit;

// partially accepted 75%

import java.util.Arrays;
import java.util.Scanner;

public class OperationWithX {

    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = scan.nextInt(); scan.nextLine();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = scan.nextInt();
        }
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();

        int avg = min + (max - min)/2;
        for(int i=0; i<n; i++) {
            if(arr[i] > avg) arr[i] -= x;
            else arr[i] += x;
        }
        max = Arrays.stream(arr).max().getAsInt();
        min = Arrays.stream(arr).min().getAsInt();
        System.out.println(Math.abs(max - min));
    }

}
