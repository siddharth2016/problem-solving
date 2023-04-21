package src;

public class LC_121_BestTimeToBuySellStock {

    public int maxProfit(int[] prices) {
        int max_so_far = Integer.MIN_VALUE;
        int ans = Integer.MIN_VALUE;
        for(int i=prices.length-1; i>=0; i--) {
            if(i == prices.length-1) max_so_far = prices[i];
            else {
                max_so_far = Integer.max(max_so_far, prices[i]);
            }
            ans = Integer.max(ans, max_so_far - prices[i]);
        }
        return ans;
    }

}
