package src.sorting.one;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(bubblesort(new int[]{5, 4, 3, 2, 1, 0, 0, 1, 4, 6, 5})));
    }


    public static int[] bubblesort(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length - i - 1; j++) {
                if(arr[j+1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

}
