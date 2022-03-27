package com.uddipta.leetcode.buy_sell_stocks_II;

public class BuyAndSellStocksTwo {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int i = 0;
        while(i+1<prices.length)
        {
            if(prices[i+1]>prices[i])
            {
                profit = profit+(prices[i+1]-prices[i]);
            }
            i++;
        }
        return profit;
    }
}
