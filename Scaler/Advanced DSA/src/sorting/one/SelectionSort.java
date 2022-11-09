package src.sorting.one;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(selectionsort(new int[] {5, 4, 3, 2, 1, 0, 0, 4, 5, 6, 1})));
        System.out.println(Arrays.toString(selectionsort(new int[] {1, 2, 3, 4, 5})));
    }
    public static int[] selectionsort(int[] arr) {
        for(int i=0; i<arr.length - 1; i++) {
            int smallest = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
