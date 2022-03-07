package com.uddipta.datastructures.linkedlist;

import java.lang.Math;

public class BinaryToDecimal {
    public int getDecimalValue(ListNode head) {
        ListNode link=head;
        int n=0;
        while(link.next != null)
        {
            n = n+1;
            link = link.next;
        }
        int decimal=0;
        while(n>=0)
        {
            int converter = (int)(Math.pow(2,n));
            decimal = decimal+converter*head.data;
            head = head.next;
            n=n-1;
        }
        return decimal;
    }
}
