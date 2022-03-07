package com.uddipta.leetcode.hw2;

import org.junit.Assert;
import org.junit.Test;

public class MaximumUnitsTest {

    @Test
    public void maximum_units_test_algo_correct_test(){
        MaximumUnits mu=new MaximumUnits();
        Assert.assertEquals(mu.maximumUnits(new int[][]{{1,3},{2,2},{3,1}}, 4),8);
        Assert.assertEquals(mu.maximumUnits(new int[][]{{5,10},{2,5},{4,7},{3,9}}, 10),91);
    }
}
