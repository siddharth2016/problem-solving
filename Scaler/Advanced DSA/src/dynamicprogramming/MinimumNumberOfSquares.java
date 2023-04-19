package src.dynamicprogramming;

import java.util.Arrays;

public class MinimumNumberOfSquares {

    int DP[] = new int[1000001];

    public int countMinSquares(int A) {
        Arrays.fill(DP, -1);
        return minSq(A);
    }
    public int minSq(int i){
        if(i==0) return 0;
        if(DP[i]==-1){
            int ans = Integer.MAX_VALUE;
            for(int j=1;j*j<=i;j++){
                ans = Math.min(ans, minSq(i-(j*j)));
            }
            DP[i]= ans+1;
        }
        return DP[i];
    }
}
