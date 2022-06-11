package practiceproblems.week7.array;

import java.util.Scanner;

public class UniquelyExistingElements {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while(test--!=0) {
            int n = scan.nextInt();
            int[] arr = new int[n];
            int[] freq = new int[1001];
            for(int i=0; i<n; i++) {
                arr[i] = scan.nextInt();
                freq[arr[i]]++;
            }
            for(int i=0; i<1001; i++) {
                if(freq[i] == 1) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }

}
