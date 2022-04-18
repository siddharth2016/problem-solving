// https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/lunch-boxes-019bf2a5/

package implementation;

import java.util.Arrays;
import java.util.Scanner;

public class LunchBoxes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while(test--!=0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[] arr = new int[m];
            for(int i=0; i<m; i++) {
                arr[i] = scanner.nextInt();
            }
            int[] A = Arrays.stream(arr).sorted().toArray();
            int count=0;
            for(int i=0; i<m; i++) {
                if(n < 0) {
                    n = 0;
                    count--;
                    break;
                }
                n -= A[i];
                count++;
            }
            if(n<0) count--;
            System.out.println(count);
        }
        scanner.close();
    }

}
