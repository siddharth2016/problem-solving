// IGNORE //


/*

package src.may23circuit;



import java.util.Scanner;

public class CountTuples2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while(test != 0) {
            int n = scan.nextInt(); scan.nextLine();
            long[] arr = new long[n];
            for(int i=0; i<n; i++) {
                arr[i] = scan.nextLong();
            }
            System.out.println(countTuples(arr, n));
            test--;
        }
    }

    public static long countTuples(long[] arr, int n) {
        long ans = 0L;
        // Index of maximum element
        // from right side
        int max = n - 1;

        // Index of minimum element
        // from left side
        int min = 0;
        int i;

        // Create an array that will store
        // index of a smaller element on left side.
        // If there is no smaller element on left
        // side, then smaller[i] will be -1.
        long[] smaller = new long[n];

        // first entry will always be -1
        smaller[0] = -1;
        for (i = 1; i < n; i++) {
            if (arr[i] < arr[min]) {
                min = i;
                smaller[i] = -1;
            }
            else
                smaller[i] = min;
        }

        // Create another array that will
        // store index of a greater element
        // on right side. If there is no greater
        // element on right side, then greater[i]
        // will be -1.
        long[] greater = new long[n];

        // last entry will always be -1
        greater[n - 1] = -1;
        for (i = n - 2; i >= 0; i--) {
            if (arr[i] > arr[max]) {
                max = i;
                greater[i] = -1;
            }
            else
                greater[i] = max;
        }

        for (i = 0; i < n; i++) {
            if (smaller[i] != -1 && greater[i] != -1) {
                ans++;
            }
        }

        return ans;
    }

}

*/
