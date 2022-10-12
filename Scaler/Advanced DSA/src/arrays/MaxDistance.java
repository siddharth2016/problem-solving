package src.arrays;

import java.util.List;

public class MaxDistance {

    public int maximumGap(final List<Integer> A) {
        int[] maxSuffix = new int[A.size()];
        int n = A.size();
        int prevMax = Integer.MIN_VALUE;
        for(int i=n-1; i>=0; i--) {
            prevMax = Integer.max(prevMax, A.get(i));
            maxSuffix[i] = prevMax;
        }

        int x = 0;
        int y = 0;
        int maxDis = Integer.MIN_VALUE;

        while(x<n && y<n) {
            if(A.get(x) <= maxSuffix[y]) {
                maxDis = Integer.max(maxDis, y-x);
                y++;
            }
            else {
                x++;
            }
        }

        return maxDis;
    }

}
