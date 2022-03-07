package com.uddipta.datastructures.linkedlist;

public class MiddleNode {
    public ListNode middleNode(ListNode head) {
        ListNode link=head;
        int n=1;
        while(link.next != null)
        {
            n = n+1;
            link = link.next;
        }
        if(n%2 == 0)
        {
            for(int i=0;i<n/2;i++)
            {
                head = head.next;
            }
        }
        else
        {
            for(int i=0;i<n/2;i++)
            {
                head = head.next;
            }
        }
        return head;
    }
}
