package src;

import java.util.Arrays;
import java.util.Scanner;

public class Mixtures {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int N = scan.nextInt(); scan.nextLine();
            long[] arr = new long[N];
            for(int i=0; i<N; i++) {
                arr[i] = scan.nextLong();
            }
            System.out.println(solve(arr, N));
        }
    }

    public static long solve(long[] A, int N) {
        long[][] dp = new long[N][N];
        for(long[] arr: dp) {
            Arrays.fill(arr, -1L);
        }
        long[] prefix = new long[N];
        prefix[0] = A[0];
        for(int i=1; i<N; i++) {
            prefix[i] = prefix[i-1] + A[i];
        }
        return findMin(A, 0, A.length-1, prefix, dp);
    }

    public static long findMin(long[] arr, int i, int j, long[] prefix, long[][] dp) {
        if(i >= j) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        long totalCost = Long.MAX_VALUE;
        for(int k=i; k<j; k++) {
            long left = findMin(arr, i, k, prefix, dp);
            long right = findMin(arr, k+1, j, prefix, dp);
            long smoke = left + right + sum(arr, i, k) * sum(arr, k+1, j);
            totalCost = Long.min(totalCost, smoke);
            dp[i][j] = totalCost;
        }
        return dp[i][j];
    }

    public static long sum(long[] arr, int i, int j) {
        long result = 0L;
        for(int k=i; k<=j; k++) {
            result = (result % 100L + arr[k] % 100L) % 100L;
        }
        return result;
    }

}
