package src.sorting.two;

public class ReversePairs {

    public int merge(int[] arr, int[] temp, int s, int mid, int e) {
        int i = s;
        int j = mid + 1;
        int k = s;
        int res = 0;
        while(i<= mid && j <= e) {
            if((long)arr[i] > (long)2*arr[j]) {
                res += mid - i + 1;
                j++;
            }
            else {
                i++;
            }
        }

        i = s;
        j = mid + 1;
        while(i<= mid && j <= e) {
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

        return res;
    }


    public int mergeSort(int[] arr, int[] temp, int s, int e) {
        if(s >= e) return 0;
        int res = 0;
        int mid = (s + e) / 2;
        res += mergeSort(arr, temp, s, mid);
        res += mergeSort(arr, temp, mid+1, e);
        res += merge(arr, temp, s, mid, e);
        return res;
    }

    public int solve(int[] A) {
        return mergeSort(A, new int[A.length], 0, A.length-1);
    }

}
