package src.sorting.two;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeSort(new int[]{5, 1, 0, 3, 2, 9, 1, 4}, 0, 7)));
    }

    public static int[] mergeSort(int[] arr, int s, int e) {
        if(s >= e) return arr;
        int mid = (s + e) / 2;
        mergeSort(arr, s, mid);
        mergeSort(arr, mid+1, e);

        merge(arr, s, mid, e);
        return arr;
    }

    public static void merge(int[] arr, int s, int mid, int e) {
        int i = s;
        int j = mid+1;
        int k = s;
        int[] temp = new int[arr.length];
        while(i <= mid && j <= e) {
            if(arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            }
            else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i <= mid) {
            temp[k] = arr[i];
            i++; k++;
        }

        while(j <= e) {
            temp[k] = arr[j];
            j++; k++;
        }

        for(i=s; i<=e; i++) {
            arr[i] = temp[i];
        }
    }

}
