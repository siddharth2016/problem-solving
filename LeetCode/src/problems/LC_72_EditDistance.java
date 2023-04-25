package src.problems;

import java.util.Arrays;

public class LC_72_EditDistance {

    // TopDown Approach
    int[][] dp;
    public int minDistance(String word1, String word2) {
        dp = new int[word1.length()][word2.length()];
        for(int[] arr: dp) {
            Arrays.fill(arr, -1);
        }
        return minOperations(word1, word2, 0, 0, dp);
    }

    public int minOperations(String word1, String word2, int i, int j, int[][] dp) {
        if(i >= word1.length() && j >= word2.length()) return 0;
        if(i >= word1.length()) return word2.length() - j;
        if(j >= word2.length()) return word1.length() - i;
        if(dp[i][j] != -1) return dp[i][j];

        if(word1.charAt(i) == word2.charAt(j)) {
            dp[i][j] = minOperations(word1, word2, i+1, j+1, dp);
        }
        else {
            dp[i][j] = Integer.min(
                    1 + minOperations(word1, word2, i+1, j+1, dp),
                    Integer.min(
                            1 + minOperations(word1, word2, i+1, j, dp),
                            1 + minOperations(word1, word2, i, j+1, dp)
                    )
            );
        }
        return dp[i][j];
    }


    // Bottom Up
    public int minDistanceBottomUp(String word1, String word2) {
        int[][] dp = new int[word1.length()+1][word2.length()+1];
        for(int i=1; i<=word2.length(); i++) {
            dp[0][i] = dp[0][i-1] + 1;
        }
        for(int i=1; i<=word1.length(); i++) {
            dp[i][0] = dp[i-1][0] + 1;
        }

        for(int i=1; i<=word1.length(); i++) {
            for(int j=1; j<=word2.length(); j++) {
                if(word1.charAt(i-1) == word2.charAt(j-1)) dp[i][j] = dp[i-1][j-1];
                else {
                    dp[i][j] = Integer.min(
                            dp[i-1][j],
                            Integer.min(dp[i-1][j-1], dp[i][j-1])
                    ) + 1;
                }
            }
        }

        return dp[word1.length()][word2.length()];
    }

}
