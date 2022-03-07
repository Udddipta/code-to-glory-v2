package com.uddipta.linked_list;

import org.junit.Assert;
import org.junit.Test;

public class DeleteAtFrontTest {

    @Test
    public void check_deleting_node_at_end(){

        DeleteAtFront list = new DeleteAtFront();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        list.deleteAtFront();

        final DeleteAtFront.LinkedListIerator iterator = list.iterator();
        Assert.assertEquals(iterator.hasNext(),true);
        Assert.assertEquals(iterator.next(),30);
        list.deleteAtFront();
        Assert.assertEquals(iterator.hasNext(),false);
        Assert.assertEquals(iterator.next(),-1);

    }
}
