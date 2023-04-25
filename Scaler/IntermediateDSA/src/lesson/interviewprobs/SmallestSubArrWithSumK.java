package lesson.interviewprobs;

import java.util.Scanner;

public class SmallestSubArrWithSumK {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        int i=0, j=1;
        int length = Integer.MAX_VALUE;
        int currSum = arr[i];
        while(i <= j && j < n) {
            if(currSum < k) {
                currSum += arr[j];
                j++;
            }
            if(currSum > k) {
                currSum -= arr[i];
                i++;
            }
            if(currSum == k) {
                if(length > j-i) length = j-i;
                currSum-=arr[i];
                i++;
            }
        }

        System.out.println(length);
    }

}
