package src.binarysearch;

public class PeakElement {

    public int peakElement(int[] arr, int s, int e) {
        if(s >= e) return arr[s];
        int mid = (s + e) / 2;
        int leftPeak = peakElement(arr, s, mid-1);
        int rightPeak = peakElement(arr, mid+1, e);
        int peak = Integer.max(rightPeak, leftPeak);
        peak = Integer.max(peak, arr[mid]);
        return peak;
    }

    public int solve(int[] A) {
        return peakElement(A, 0, A.length-1);
    }

}
