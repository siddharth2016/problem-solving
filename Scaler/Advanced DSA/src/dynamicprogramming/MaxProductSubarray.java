package src.dynamicprogramming;

public class MaxProductSubarray {

    public int maxProduct(final int[] A) {
        int min_so_far = A[0];
        int max_so_far = A[0];
        int ans = A[0];
        for(int i=1; i<A.length; i++) {
            int min_so_far_temp = Integer.min(Integer.min(A[i], A[i] * min_so_far), A[i] * max_so_far);
            int max_so_far_temp = Integer.max(Integer.max(A[i], A[i] * min_so_far), A[i] * max_so_far);
            min_so_far = min_so_far_temp;
            max_so_far = max_so_far_temp;
            ans = Integer.max(ans, max_so_far);
        }
        return ans;
    }

}
