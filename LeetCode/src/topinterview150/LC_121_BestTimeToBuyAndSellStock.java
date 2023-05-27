package src.topinterview150;

public class LC_121_BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int ans = 0;
        int max_so_far = 0;
        for(int i=prices.length-1; i>=0; i--) {
            max_so_far = Integer.max(max_so_far, prices[i]);
            ans = Integer.max(ans, max_so_far - prices[i]);
        }
        return ans;
    }

}
