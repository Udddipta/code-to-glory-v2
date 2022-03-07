package com.uddipta.linked_list;

public class InsertAtEnd {
    private LinkedListNode head;
    private int size = 0;

    class LinkedListIerator {
        private LinkedListNode currentNode;

        private LinkedListIerator(LinkedListNode startingNode){
            this.currentNode = startingNode;
        }

        public boolean hasNext(){
            return !(currentNode == null);
        }

        public int next(){
            if(hasNext()) {
                int result = currentNode.getData();
                currentNode = currentNode.getNext();
                return result;
            }

            return -1;
        }
    }
    public void insertAtEnd(int data) {
        LinkedListNode node = new LinkedListNode(data);

        if(head == null){
            head = node;
            return;
        }
        node.setNext(null);
        while(head.getNext() != null){
            head = head.getNext();
        }
        head.setNext(node);
        size = size+1;
        return;
    }
    public int getSize() {
        return size;
    }
    public LinkedListIerator iterator(){
        return new LinkedListIerator(head);
    }
}
