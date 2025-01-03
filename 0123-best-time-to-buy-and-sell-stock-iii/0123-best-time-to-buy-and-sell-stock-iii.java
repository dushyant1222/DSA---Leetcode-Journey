class Solution {
    public int maxProfit(int[] prices) {
        int MinPrice = prices[0], MaxPrice = prices[prices.length - 1];
        int[] leftprofit = new int[prices.length];
        int[] rightprofit = new int[prices.length];
        int MaxProfit = 0;
        for(int i = 1; i< prices.length; i++){
            MinPrice =  Math.min(prices[i], MinPrice);
            leftprofit[i] = Math.max(leftprofit[i - 1], prices[i] -  MinPrice);
        }
        for(int i = prices.length - 2; i>= 0; i--){
            MaxPrice = Math.max(prices[i], MaxPrice);
            rightprofit[i] = Math.max(rightprofit[i+1], MaxPrice - prices[i]);
        }
        for(int i = 0; i< prices.length; i++){
            MaxProfit = Math.max(MaxProfit, leftprofit[i] + rightprofit[i]);
        }
        return MaxProfit;
    }
}