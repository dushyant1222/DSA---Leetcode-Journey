class Solution {
    public int maxProfit(int[] prices) {
        int min_profit = Integer.MAX_VALUE;
        int max_profit = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < min_profit){
                min_profit = prices[i];
            }
            int temp = prices[i] - min_profit;
            if(temp > max_profit){
                max_profit = temp;
            }
        }
        return max_profit;
    }
}