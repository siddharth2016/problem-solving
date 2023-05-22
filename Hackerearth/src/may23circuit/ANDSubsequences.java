package src.may23circuit;

// not accepted solution

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ANDSubsequences {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt(); scan.nextLine();
        while(test!=0) {

            int n = scan.nextInt(); int x = scan.nextInt(); scan.nextLine();
            Integer[] arr = new Integer[n];
            for(int i=0; i<n; i++) {
                arr[i] = scan.nextInt();
            } scan.nextLine();
            int totalSubsequences = countSubseq(arr, n, x);
            System.out.println(totalSubsequences);
            test--;
        }
    }

    public static int countSubseq(Integer[] arr, int n, int x) {
        int ans = (int)Math.pow(2, 31) - 1;
        int count = 0;
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i=0; i<n; i++) {
            if((ans & arr[i]) >= x) {
                count++;
                ans = ans & arr[i];
            }
        }
        if(count == 0) return -1;
        return count;
    }

}


/*

3
3 2
1 2 3
5 3
6 1 7 4 3
3 5
1 3 4



 */