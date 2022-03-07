package com.uddipta.leetcode.good_pairs;

import org.junit.Assert;
import org.junit.Test;

public class GoodPairsTest {

    @Test
    public void good_pairs_algo_correct_test(){
        GoodPairs gp = new GoodPairs();
        Assert.assertEquals(gp.numIdenticalPairs(new int[]{1,2,3,1,1,3}),4);
        Assert.assertEquals(gp.numIdenticalPairs(new int[]{1,1,1,1}),6);
        Assert.assertEquals(gp.numIdenticalPairs(new int[]{1,2,3}),0);
    }
}
