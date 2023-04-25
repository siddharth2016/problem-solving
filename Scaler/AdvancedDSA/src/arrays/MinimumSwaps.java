package src.arrays;

public class MinimumSwaps {

    public int solve(int[] A, int B) {
        int reqNums = 0;
        int n = A.length;
        for(int i=0; i<n; i++) {
            if(A[i] <= B) reqNums++;
        }

        int notReqNums = 0;
        for(int i=0; i<reqNums; i++) {
            if(A[i] > B) notReqNums++;
        }

        int start = 1;
        int end = reqNums;
        int ans = notReqNums;
        while(end < n) {
            if(A[start - 1] > B) notReqNums--;
            if(A[end] > B) notReqNums++;
            ans = Integer.min(ans, notReqNums);
            start++; end++;
        }

        return ans;
    }

}
