package src.arrays;

import java.util.Arrays;

public class TripletSumSmaller {

    public static int solvePairSumSmaller(int[] arr, int i, int j, int sum) {
        int count=0;
        while(i < j) {
            if(arr[i] + arr[j] > sum) j--;
            if(arr[i] + arr[j] <= sum) {
                count += j-i;
                i++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 1, 8, 9, 4, 5};
        int K = 10;
        int count = 0;
        Arrays.sort(arr);
        for(int i=0; i<arr.length-2; i++) {
            int T = K - arr[i];
            count += solvePairSumSmaller(arr, i+1, arr.length-1, T);
        }
        System.out.println(count);
    }
}
