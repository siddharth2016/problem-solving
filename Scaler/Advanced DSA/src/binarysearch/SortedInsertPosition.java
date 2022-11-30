package src.binarysearch;

public class SortedInsertPosition {

    public int binarySearch(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;

        while(s <= e) {
            int mid = (s + e) / 2;

            if(arr[mid] == target) return mid;

            if(arr[mid] < target) s = mid + 1;

            else e = mid - 1;
        }

        return s;
    }

    public int searchInsert(int[] A, int B) {
        return binarySearch(A, B);
    }

}
