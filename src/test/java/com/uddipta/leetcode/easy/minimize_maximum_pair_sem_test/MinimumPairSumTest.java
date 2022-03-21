package com.uddipta.leetcode.easy.minimize_maximum_pair_sem_test;

import com.uddipta.leetcode.minimize_maximum_pair_sum.MinimumPairSum;
import org.junit.Assert;
import org.junit.Test;

public class MinimumPairSumTest {


    @Test
    public void check_minimum_pair_sum_algo_correct_test(){
        MinimumPairSum mps = new MinimumPairSum();
        Assert.assertEquals(mps.minPairSum(new int[]{3,5,2,3}),7);
        Assert.assertEquals(mps.minPairSum(new int[]{3,5,4,2,4,6}),8);
    }
}
