package src.sorting.two;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(quickSort(new int[]{5, 1, 0, 3, 2, 9, 1, 4}, 0, 7)));
    }

    public static int[] quickSort(int[] arr, int s, int e) {
        if(s >= e) return arr;
        int pivot = partition(arr, s, e);
        quickSort(arr, s, pivot-1);
        quickSort(arr, pivot+1, e);
        return arr;
    }

    public static int partition(int[] arr, int s, int e) {
        int p = arr[e];
        int i = s-1;
        for(int j=s; j<e; j++) {
            if(arr[j] <= p) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = p;
        arr[e] = temp;

        return i+1;
    }

}
