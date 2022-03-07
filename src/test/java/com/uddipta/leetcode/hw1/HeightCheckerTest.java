package com.uddipta.leetcode.hw1;

import org.junit.Assert;
import org.junit.Test;


public class HeightCheckerTest {

    @Test
    public void check_height_checker_algo_correct_test(){
        HeightChecker homeWork= new HeightChecker();
        Assert.assertEquals(homeWork.heightChecker(new int[]{1,1,4,2,1,3}), 3);
        Assert.assertEquals(homeWork.heightChecker(new int[]{5,1,2,3,4}), 5);
        Assert.assertEquals(homeWork.heightChecker(new int[]{1,2,3,4,5}), 0);
    }
}
