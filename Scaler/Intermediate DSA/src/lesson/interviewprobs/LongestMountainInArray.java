package lesson.interviewprobs;

public class LongestMountainInArray {

    public int longestMountain(int[] arr) {
        int n = arr.length;
        int largest = 0;
        for(int i=1; i<n-1; ) {
            int peak = arr[i];
            int count = 1;
            if(arr[i-1] < peak && arr[i+1] < peak) {
                int j = i-1;
                while(j>=0 && arr[j] < arr[j+1]) {
                    count++; j--;
                }
                while(i<n-1 && arr[i] > arr[i+1]) {
                    count++; i++;
                }
                largest = Math.max(largest, count);
            }
            else i++;
        }
        if(largest == 1) largest = 0;
        return largest;
    }

}
