package com.uddipta.leetcode.hw3;

import org.junit.Assert;
import org.junit.Test;

public class UniqueOccurrencesTest {

    @Test
    public void unique_occurrences_algo_correct_test(){
        UniqueOccurrences uo=new UniqueOccurrences();
        Assert.assertEquals(uo.uniqueOccurrences(new int[]{1,2,2,1,1,3}),true);
        Assert.assertEquals(uo.uniqueOccurrences(new int[]{1,2}),false);
        Assert.assertEquals(uo.uniqueOccurrences(new int[]{-3,0,1,-3,1,1,1,-3,10,0}),true);
    }
}
