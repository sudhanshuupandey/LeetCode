class Solution {
    public int maxProfit(int[] prices) {
        int leastVal = Integer.MAX_VALUE;
        int profit = 0;
        int n = prices.length;
        int localProfit = 0;
        for(int i=0;i<n;i++){
            if(prices[i]<leastVal){
                leastVal = prices[i];
            }
            localProfit = prices[i] - leastVal;
            if(profit < localProfit){
                profit = localProfit;
            }
        }
        return profit;
    }
}