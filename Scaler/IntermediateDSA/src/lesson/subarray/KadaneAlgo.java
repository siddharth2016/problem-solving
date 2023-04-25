package lesson.subarray;

import java.util.Scanner;

public class KadaneAlgo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = scan.nextInt();
        }
        boolean allNeg = true;
        for(int i=0; i<n; i++) {
            if(arr[i] >= 0) {
                allNeg = false;
                break;
            }
        }
        if(allNeg) System.out.println("Max of arr");
        else {
            int currentSum = 0;
            int largestSum = 0;
            for(int val : arr) {
                currentSum += val;
                if(currentSum < 0) currentSum = 0;
                if(largestSum < currentSum) largestSum = currentSum;
            }
            System.out.println(largestSum);
        }
    }

}
