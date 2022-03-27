package com.uddipta.leetcode.buy_sell_stocks_II;

import org.junit.Assert;
import org.junit.Test;

public class BuyAndSellStocksTwoTest {


    @Test
    public void check_buy_and_sell_two_algo_correct_test(){
        BuyAndSellStocksTwo bst = new BuyAndSellStocksTwo();
        Assert.assertEquals(bst.maxProfit(new int[]{7,1,5,3,6,4}),7);
        Assert.assertEquals(bst.maxProfit(new int[]{1,2,3,4,5}),4);
        Assert.assertEquals(bst.maxProfit(new int[]{7,6,4,3,1}),0);
    }
}
