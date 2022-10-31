package src.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(insertionsort(new int[] {5, 4, 3, 2, 1, 0, 1, 0, 4, 6, 5})));
        System.out.println(Arrays.toString(insertionsort(new int[] {1,2,3,4,5})));
    }

    public static int[] insertionsort(int[] arr) {
        for(int i=1; i<arr.length; i++) {
            int j = i-1;
            int temp = arr[i];
            while(j>=0 && arr[j] > temp) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        return arr;
    }

}
