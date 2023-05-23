package src.may23circuit;

// not accepted solution

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
        boolean notPossible = true;
        for(int val: arr) {
            if (val >= x) {
                notPossible = false;
                break;
            }
        }
        if(notPossible) return -1;

        int[] bits = new int[32];
        for(int val: arr) {
            for(int i=0; i<32; i++) {
                if((val&(1<<i)) != 0) bits[i]++;
            }
        }

        int msb = 0;
        while(msb < 32) {
            if(x == 0) break;
            x = x>>1;
            msb++;
        }
        msb = msb - 1;

        int ans = bits[msb];
        for(int i=msb; i<32; i++) {
            ans = Integer.max(ans, bits[i]);
        }

        return ans;

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