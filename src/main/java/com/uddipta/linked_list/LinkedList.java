package com.uddipta.linked_list;

public class LinkedList {
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

    public void insertAtFront(int data) {
        LinkedListNode node = new LinkedListNode(data);

        if (head != null) {
            node.setNext(head);
        }
        head = node;
        size += 1;
    }

    public int getSize() {
        return size;
    }

    public LinkedListIerator iterator(){
        return new LinkedListIerator(head);
    }
}
