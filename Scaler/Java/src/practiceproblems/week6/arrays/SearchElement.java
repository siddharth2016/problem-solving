package practiceproblems.week6.arrays;

import java.util.Scanner;

public class SearchElement {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while(test--!=0) {
            int n = scan.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++) {
                arr[i] = scan.nextInt();
            }
            int b = scan.nextInt();
            int found = 0;
            for(int i=0; i<n; i++) {
                if(arr[i] == b) {
                    found = 1;
                    break;
                }
            }
            System.out.println(found);
        }
    }

}
