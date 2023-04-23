package src;

import java.util.Arrays;

public class LC_72_EditDistance {

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

}
