package src.binarysearch;

public class BinarySearch {

    public static void main(String[] args) {
        int t = 3;

        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(binarySearch(arr, t));
    }

    public static int binarySearch(int[] arr, int t) {
        int s = 0;
        int e = arr.length - 1;

        while(s <= e) {
            int mid = s + (e-s)/2;
            if(arr[mid] == t) return mid;
            if(arr[mid] < t) s = mid + 1;
            else e = mid - 1;
        }

        return -1;
    }

}
