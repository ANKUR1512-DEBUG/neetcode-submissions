class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        for (int l = 0; l < prices.length; l++) {
            for (int r = l + 1; r < prices.length; r++) {
                
                int profit = prices[r] - prices[l];
                maxProfit = Math.max(maxProfit, profit);
            }
        }

        return maxProfit;
    }
}
