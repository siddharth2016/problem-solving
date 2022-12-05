package src.binarysearch;

import java.util.ArrayList;

public class SearchInBitonicArray {

    public int findPeakIndx(ArrayList<Integer> arr) {
        int s = 1;
        int e = arr.size()-1;
        if(arr.get(0) > arr.get(1)) return 0;
        if(arr.get(e) > arr.get(e-1)) return e;
        e = e-1;
        int ans = 0;
        while(s <= e) {
            int mid = s + (e-s)/2;
            if(arr.get(mid-1) < arr.get(mid) && arr.get(mid) > arr.get(mid+1)) {
                ans = mid; break;
            }
            else if(arr.get(mid) < arr.get(mid+1)) s = mid + 1;
            else e = mid - 1;
        }
        return ans;
    }

    public int findElementInLeft(ArrayList<Integer> arr, int peak, int B) {
        int s = 0;
        int e = peak;
        while(s <= e) {
            int mid = s + (e-s)/2;
            if(arr.get(mid) == B) return mid;
            else if(arr.get(mid) < B) s = mid + 1;
            else e = mid - 1;
        }
        return -1;
    }

    public int findElementInRight(ArrayList<Integer> arr, int peak, int B) {
        int s = peak;
        int e = arr.size()-1;
        while(s <= e) {
            int mid = s + (e-s)/2;
            if(arr.get(mid) == B) return mid;
            else if(arr.get(mid) > B) s = mid + 1;
            else e = mid - 1;
        }
        return -1;
    }

    public int solve(ArrayList<Integer> A, int B) {
        int peakIndx = findPeakIndx(A);
        int result = findElementInLeft(A, peakIndx, B);
        if(result == -1) {
            result = findElementInRight(A, peakIndx+1, B);
        }
        return result;
    }

}
