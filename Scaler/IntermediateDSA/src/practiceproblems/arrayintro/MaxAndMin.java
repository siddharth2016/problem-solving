package practiceproblems.arrayintro;

import java.util.Scanner;

public class MaxAndMin {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = scan.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int val: arr) {
            if(val > max) max = val;
            if(val < min) min = val;
        }
        System.out.println(max + " " + min);
    }

}
