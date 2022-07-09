package lesson.matrices;

import java.util.Scanner;

public class OrganisingFarmProblem {

    private static int[][] getPrefixSumMatrix(int[][] mat, int n) {
        int[][] prefixSumMat = new int[n][n];
        int tempSum = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(i == 0) {
                    tempSum += mat[i][j];
                    prefixSumMat[i][j] = tempSum;
                }
                else if(j == 0) {
                    prefixSumMat[i][j] = prefixSumMat[i-1][j] + mat[i][j];
                }
                else {
                    prefixSumMat[i][j] = prefixSumMat[i-1][j] + prefixSumMat[i][j-1] - prefixSumMat[i-1][j-1] + mat[i][j];
                }
            }
        }
        return prefixSumMat;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] mat = new int[n][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                mat[i][j] = scan.nextInt();
            }
        }

        int[][] prefixSumMat = getPrefixSumMatrix(mat, n);
        printMat(prefixSumMat, n);

        int ans = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                int q1 = prefixSumMat[i][j];
                int q2 = prefixSumMat[i][n-1] - q1;
                int q3 = prefixSumMat[n-1][j] - q1;
                int q4 = prefixSumMat[n-1][n-1] - q1 - q2 - q3;
                int min = Math.min(q1, Math.min(q2, Math.min(q3, q4)));
                ans = Math.max(ans, min);
            }
        }
        System.out.println(ans);
    }

    private static void printMat(int[][] mat, int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

}
