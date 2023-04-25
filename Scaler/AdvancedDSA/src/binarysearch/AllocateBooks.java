package src.binarysearch;

public class AllocateBooks {

    public boolean possible(int[] arr, int k, int page) {
        int count = 1;
        int sum = 0;
        for(int val: arr) {
            sum += val;
            if(sum > page) {
                count++;
                sum = val;
            }
        }
        return count<=k;
    }

    public int books(int[] A, int B) {
        if(A.length<B) return -1;

        int start = Integer.MIN_VALUE;
        long end = 0;
        for(int val: A) {
            if(start < val) start = val;
            end += val;
        }

        int ans = -1;
        while(start <= end) {
            int mid = start + (int)(end - start)/2;
            if(possible(A, B, mid)) {
                ans = mid;
                end = mid - 1;
            }
            else start = mid + 1;
        }
        return ans;
    }

}
