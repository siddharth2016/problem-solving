package src;

public class LC_278_FirstBadVersion {

    public boolean isBadVersion(int n) {
        return n > 5;
    }

    public int firstBadVersion(int n) {
        int ans = 1;
        int start = 1;
        int end = n;
        while(start <= end) {
            int mid = start + (end - start)/2;
            if(isBadVersion(mid)) {
                ans = mid;
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return ans;
    }

}
