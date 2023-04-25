package src.sorting.three;

public class QuickSort {

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int selectPivot(int[] arr, int s, int e) {
        int i = s-1;
        int p = arr[e];
        for(int j=s; j<e; j++) {
            if(arr[j] <= p) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, e);
        return i+1;
    }

    public void quickSort(int[] arr, int s, int e) {
        if(s >= e) return;
        int pivot = selectPivot(arr, s, e);
        quickSort(arr, s, pivot-1);
        quickSort(arr, pivot+1, e);
    }

    public int[] solve(int[] A) {
        quickSort(A, 0, A.length-1);
        return A;
    }

}
