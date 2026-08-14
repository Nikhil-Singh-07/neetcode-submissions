class Solution {
    public int maxProfit(int[] prices) {
        int profit = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++){
            if (profit > prices[i]){
                profit = prices[i];
            }
            else if(maxProfit < prices[i] - profit){
                maxProfit = prices[i] - profit;
            }
        }
        return maxProfit;
    }
}
