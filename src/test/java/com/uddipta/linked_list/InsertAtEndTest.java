package com.uddipta.linked_list;

import org.junit.Assert;
import org.junit.Test;

public class InsertAtEndTest {

    @Test
    public void check_inserting_node_at_end(){
        InsertAtEnd list = new InsertAtEnd();

        list.insertAtEnd(10);
        list.insertAtEnd(20);

        final InsertAtEnd.LinkedListIerator iterator = list.iterator();
        Assert.assertEquals(iterator.hasNext(), true);
        Assert.assertEquals(iterator.next(), 10);
        Assert.assertEquals(iterator.hasNext(), true);
        Assert.assertEquals(iterator.next(), 20);

        Assert.assertEquals(iterator.hasNext(), false);


    }
}
