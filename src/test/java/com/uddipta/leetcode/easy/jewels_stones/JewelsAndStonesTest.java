package com.uddipta.leetcode.easy.jewels_stones;

import org.junit.Assert;
import org.junit.Test;

public class JewelsAndStonesTest {

    @Test
    public void jewels_and_stones_algo_correct_test(){
        JewelsAndStones js = new JewelsAndStones();
        Assert.assertEquals(js.numJewelsInStones("aA","aAAbbbb"),3);
        Assert.assertEquals(js.numJewelsInStones("z","ZZ"),0);
    }
}
