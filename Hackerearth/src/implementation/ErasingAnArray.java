// https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/erasing-the-array-7e9e0400/

package src.implementation;

import java.util.Scanner;

public class ErasingAnArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while(test--!=0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++) {
                arr[i] = scanner.nextInt();
            }
            int count = 1;
            for(int i=1; i<n; i++) {
                if (arr[i] == 0 && arr[i - 1] == 1) count++;
            }
            System.out.println(count);
        }
    }

}
