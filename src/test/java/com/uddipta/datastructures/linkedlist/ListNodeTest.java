package com.uddipta.datastructures.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class ListNodeTest {

    @Test
    public void list_node_object_creation_getter_test(){
        ListNode node1 = new ListNode(10);
        ListNode node2 = new ListNode(20);
        node2.setNext(node1);
        ListNode head = new ListNode(30);
        head.setNext(node2);
        Assert.assertEquals(head.getData(),30,20);
        Assert.assertEquals(node2.getData(),20,10);
    }
}
