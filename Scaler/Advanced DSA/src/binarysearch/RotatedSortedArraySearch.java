package src.binarysearch;

public class RotatedSortedArraySearch {

    public int binarySearch(final int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        while(s <= e) {
            int mid = s + (e-s)/2;
            if(arr[mid] == target) return mid;

            if(arr[mid] > target) {
                if(arr[0] <= arr[mid]) {
                    if(arr[0] <= target) e = mid - 1;
                    else s = mid + 1;
                }
                else {
                    if(arr[0] <= target) s = mid + 1;
                    else e = mid - 1;
                }
            }

            else {
                if(arr[0] <= arr[mid]) {
                    if(arr[0] <= target) s = mid + 1;
                    else e = mid - 1;
                }
                else {
                    if(arr[0] <= target) e = mid - 1;
                    else s = mid + 1;
                }
            }
        }

        return -1;
    }

    public int search(final int[] A, int B) {
        return binarySearch(A, B);
    }

}
