package com.uddipta.linked_list;

public class LinkedListNode {
    private int data;
    private LinkedListNode next;

    public LinkedListNode(int data) {
        this.data = data;
    }

    //Setters
    public void setNext(LinkedListNode next) {
        this.next = next;
    }

    //Getters
    public int getData() {
        return data;
    }

    //Getters
    public LinkedListNode getNext() {
        return next;
    }

    @Override
    public String toString() {
        return "LinkedListNode{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
