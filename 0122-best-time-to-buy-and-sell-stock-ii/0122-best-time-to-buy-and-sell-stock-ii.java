class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buy = 0;
        int profit = 0;
        for(int i = 0; i < n; i++){
            if(i == n-1) profit = buy;
           else if(prices[i] < prices[i+1]) buy += prices[i + 1] - prices[i];
        }
        return profit;
    }
}