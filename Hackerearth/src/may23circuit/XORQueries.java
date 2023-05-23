package src.may23circuit;

import java.util.Scanner;

public class XORQueries {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); scan.nextLine();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = scan.nextInt();
        }
        int q = scan.nextInt();
        while(q != 0) {
            int q1 = scan.nextInt();
            if(q1 == 1) {
                int l = scan.nextInt();
                int r = scan.nextInt();
                int x = scan.nextInt();
                for(int i=l-1; i<r; i++) {
                    arr[i] = x;
                }
            }
            else if(q1 == 2) {
                int l = scan.nextInt();
                int r = scan.nextInt();
                int x = scan.nextInt();
                for(int i=l-1; i<r; i++) {
                    arr[i] ^= x;
                }
            }
            else {
                int l = scan.nextInt();
                int r = scan.nextInt();
                int ans = 0;
                for(int i=l-1; i<r; i++) {
                    ans += arr[i];
                }
                System.out.println(ans);
            }
            q--;
        }
    }
}
