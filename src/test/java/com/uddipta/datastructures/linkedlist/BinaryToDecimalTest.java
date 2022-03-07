package com.uddipta.datastructures.linkedlist;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class BinaryToDecimalTest {

    @Test
    public void binary_to_decimal_algo_correct_test(){
        BinaryToDecimal bd = new BinaryToDecimal();

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(0);
        node2.setNext(node1);
        ListNode head = new ListNode(1);
        head.setNext(node2);
        Assert.assertEquals(bd.getDecimalValue(head),5);

    }
}
