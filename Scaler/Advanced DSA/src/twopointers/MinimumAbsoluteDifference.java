package src.twopointers;

public class MinimumAbsoluteDifference {

    public int solve(int[] A, int[] B, int[] C) {
        int a = 0;
        int b = 0;
        int c = 0;
        int ans = Integer.MAX_VALUE;
        while(a<A.length && b<B.length && c<C.length) {
            int max = Math.max(A[a], Math.max(B[b], C[c]));
            int min = Math.min(A[a], Math.min(B[b], C[c]));
            int diff = Math.abs(max - min);
            ans = Math.min(ans, diff);
            if(min == A[a]) a++;
            else if(min == B[b]) b++;
            else c++;
        }
        return ans;
    }

}
