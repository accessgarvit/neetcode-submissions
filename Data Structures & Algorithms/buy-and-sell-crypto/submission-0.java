class Solution {
    public int maxProfit(int[] prices) {

        int buy = 0;
        int sell = buy+1;
        int profit= 0 ;

        for(int i = 0 ; i < prices.length-1;i++)
        {
            if(prices[sell]>prices[buy])
            {
                profit = Math.max(profit,prices[sell]-prices[buy]);
                sell++;
            }

            else
            {
                buy = sell;
                sell = buy+1;
            }
        }
        
        return profit;
    }
}
