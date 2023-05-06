package src.dynamicprogramming;

import java.util.Arrays;

public class RussianDollEnvelops {

    public static void main(String[] args) {
        System.out.println(solve(new int[][] {
                {6,18},
                {2,14},
                {5,6},
                {4,15},
                {8,11},{3,11},{11,10},{5,11}
        }));
    }

    public static int solve(int[][] A) {
        Arrays.sort(A,
                (a1, a2) -> {
                    if(a1[0] != a2[0]) return Integer.compare(a1[0], a2[0]);
                    else return Integer.compare(a1[1], a2[1]);
                }
        );

        int[] dp = new int[A.length];
        Arrays.fill(dp, 1);

        int ans = 1;
        for(int i=1; i<A.length; i++) {
            for(int j=0; j<i; j++) {
                if(A[i][0] > A[j][0] && A[i][1] > A[j][1]) {
                    dp[i] = Integer.max(dp[i], dp[j]+1);
                }
            }
            ans = Integer.max(ans, dp[i]);
        }

        return ans;
    }

}
