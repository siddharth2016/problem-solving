package practiceproblems.arrayintro;

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
            int B = scan.nextInt();
            int exists = 0;
            for(int val: arr) {
                if(val == B) {
                    exists = 1;
                    break;
                }
            }
            System.out.println(exists);
        }
    }

}
