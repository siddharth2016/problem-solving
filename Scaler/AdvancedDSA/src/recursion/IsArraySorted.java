package src.recursion;

public class IsArraySorted {

    public static boolean isSortedArray(int[] arr, int n) {
        if(n == 1 || n == 0) return true;
        return arr[n-1] >= arr[n-2] && isSortedArray(arr, n-1);
    }

    public static void main(String[] args) {
        System.out.println(isSortedArray(new int[]{1, 2, 3, 4, 5}, 5));
        System.out.println(isSortedArray(new int[]{10, 20, 33, 44, 65}, 5));
        System.out.println(isSortedArray(new int[]{1, 12, 3, 4, 5}, 5));
        System.out.println(isSortedArray(new int[]{5, 5}, 2));
    }

}
