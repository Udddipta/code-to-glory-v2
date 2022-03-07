package com.uddipta.linked_list;

import org.junit.Assert;
import org.junit.Test;

public class LinkeListTest {

    @Test
    public void check_inserting_node_at_front(){
        LinkedList list = new LinkedList();

        list.insertAtFront(10);
        list.insertAtFront(20);

        final LinkedList.LinkedListIerator iterator = list.iterator();
        Assert.assertEquals(iterator.hasNext(), true);
        Assert.assertEquals(iterator.next(), 20);

        Assert.assertEquals(iterator.hasNext(), true);
        Assert.assertEquals(iterator.next(), 10);

        Assert.assertEquals(iterator.hasNext(), false);
    }
}
