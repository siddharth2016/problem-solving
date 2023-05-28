package src.topinterview150;

public class LC_122_BestTimeToBuyAndSellStock2 {

    public int maxProfit(int[] prices) {
        int max_so_far = 0;
        int ans = 0;
        for(int i=prices.length-1; i>=0; i--) {
            if(prices[i] <= max_so_far) ans += max_so_far - prices[i];
            max_so_far = prices[i];
        }
        return ans;
    }

}
