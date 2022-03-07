package com.uddipta.datastructures.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class MiddleNodeTest {

    @Test
    public void middle_node_test_algo_correct_test(){
        MiddleNode mn = new MiddleNode();

        ListNode node1 = new ListNode(5);
        ListNode node2 = new ListNode(4);
        node2.setNext(node1);
        ListNode node3 = new ListNode(3);
        node3.setNext(node2);
        ListNode node4 = new ListNode(2);
        node4.setNext(node3);
        ListNode head = new ListNode(1);
        head.setNext(node4);


        Assert.assertEquals(mn.middleNode(head),3);
    }
}
