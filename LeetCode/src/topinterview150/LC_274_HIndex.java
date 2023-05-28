package src.topinterview150;

public class LC_274_HIndex {

    public int hIndex(int[] citations) {
        int[] dp = new int[1001];
        for(int val: citations) {
            dp[val]++;
        }
        int ans = 0;
        for(int i=999; i>=0; i--) {
            dp[i] += dp[i+1];
            if(i <= dp[i]) {
                ans = i;
                break;
            }
        }
        return ans;
    }

}
