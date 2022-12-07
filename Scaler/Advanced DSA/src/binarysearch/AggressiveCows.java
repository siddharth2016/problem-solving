package src.binarysearch;

import java.util.Arrays;

public class AggressiveCows {

    public boolean check(int[] arr, int k, int val) {
        int count = 1;
        int prev = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(arr[i] - prev >= val) {
                count++;
                prev = arr[i];
            }
        }
        return count>=k;
    }

    public int solve(int[] A, int B) {
        Arrays.sort(A);
        int start = 0;
        int end = A[A.length-1];
        int ans = 0;
        while(start <= end) {
            int mid = start + (end-start)/2;
            if(check(A, B, mid)) {
                ans = mid;
                start = mid + 1;
            }
            else end = mid - 1;
        }
        return ans;
    }

}
