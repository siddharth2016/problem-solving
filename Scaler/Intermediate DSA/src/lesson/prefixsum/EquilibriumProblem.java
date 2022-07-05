package lesson.prefixsum;

import java.util.Scanner;

public class EquilibriumProblem {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = scan.nextInt();
        }
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for(int i=1; i<n; i++) {
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }
        int count=0;
        int leftSum=0, rightSum=0;
        for(int i=0; i<n; i++) {
            if(i != 0) {
                leftSum = prefixSum[i-1];
            }
            rightSum = prefixSum[n-1] - prefixSum[i];
            if(leftSum == rightSum) count++;
        }
        System.out.println(count);
    }

}
