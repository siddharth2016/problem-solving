// https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/best-index-1-45a2f8ff/

package basics;

import java.util.Scanner;

public class BestIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] arr = new long[n];
        for(int i=0; i<n; i++) {
            arr[i] = scanner.nextLong();
        }
        long[] cumulativeSum = new long[n];
        long cumSum = 0;
        long maxSum = Long.MIN_VALUE;
        for(int i=0; i<n; i++) {
            cumSum += arr[i];
            cumulativeSum[i] = cumSum;
        }

        for(int i=0; i<n; i++) {
            int maxPossibleIndx = getMaxPossibleIndx(i, n);
            long possibleSum = i != 0
                    ? cumulativeSum[maxPossibleIndx] - cumulativeSum[i-1]
                    : cumulativeSum[maxPossibleIndx];
            maxSum = Long.max(maxSum, possibleSum);
        }

        System.out.println(maxSum);
    }

    static int getMaxPossibleIndx(int i, int n) {
        int valueToAdd = 1;
        while(i<n) {
            valueToAdd++;
            i += valueToAdd;
        }
        return i-valueToAdd;
    }
}
