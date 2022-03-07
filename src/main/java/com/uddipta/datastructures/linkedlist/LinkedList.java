package com.uddipta.datastructures.linkedlist;

public class LinkedList {

    private ListNode head;

    public LinkedList(){
        this.head = null;
    }

    public void insertFirst(int data){
        ListNode newNode = new ListNode(data);

        if(head != null){
            newNode.setNext(head);
        }
        this.head = newNode;
    }
}
