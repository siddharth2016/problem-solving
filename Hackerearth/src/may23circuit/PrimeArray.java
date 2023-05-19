package src.may23circuit;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeArray {

    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        int[] primes = new int[100001];
        Arrays.fill(primes, 1);
        primes[0] = 0;
        primes[1] = 0;
        for(int i=2; i*i<100001; i++) {
            if(primes[i] == 1) {
                for(int j=i*i; j<100001; j+=i) {
                    primes[j] = 0;
                }
            }
        }

        int test = scan.nextInt(); scan.nextLine();
        while(test!=0) {
            int n = scan.nextInt(); scan.nextLine();
            int[] arr = new int[n];
            for(int i=0; i<n; i++) {
                arr[i] = scan.nextInt();
            }
            System.out.println(solve(arr, n, primes));
            test--;
        }
    }

    public static long[] createLeft(int[] arr, int n, int[] primes) {
        long[] result = new long[n];
        long totalOnes = 0L;
        for(int i=0; i<n; i++) {
            if(arr[i] == 1) totalOnes++;
            result[i] = totalOnes;
        }
        return result;
    }

    public static long solve(int[] arr, int n, int[] primes) {
        long[] left = createLeft(arr, n, primes);
        System.out.println(Arrays.toString(left));
        long ans = 0L;
        for(int i=0; i<n; i++) {
            if(primes[arr[i]] == 1) {
                long leftOnes = left[i];
                long rightOnes = left[n-1] - left[i];
                long crossPairs = leftOnes * rightOnes;
                long leftPairs = 0L;
                long rightPairs = 0L;
                if(leftOnes != 0) leftPairs = (leftOnes * (leftOnes-1))/2;
                if(rightOnes != 0) rightPairs = (rightOnes * (rightOnes-1))/2;
                ans += crossPairs + leftPairs + rightPairs;
            }
        }
        return ans;
    }

}
