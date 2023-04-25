package src.binarysearch;

public class SpecialInteger {

    public boolean check(int[] arr, int k, int B) {
        long sum = 0;
        int i;
        for(i=0; i<k; i++) sum += (long)arr[i];
        if(sum > (long)B) return false;
        int l = 0;
        while(i < arr.length) {
            sum += (long)arr[i] - (long)arr[l];
            if(sum > (long)B) return false;
            i++; l++;
        }
        return true;
    }

    public int solve(int[] A, int B) {
        int n = A.length;
        int s = 0;
        int e = n;
        int ans = -1;
        while(s <= e) {
            int mid = s + (e-s)/2;
            if(check(A, mid, B)) {
                ans = mid;
                s = mid + 1;
            }
            else e = mid - 1;
        }
        return ans;
    }

}
