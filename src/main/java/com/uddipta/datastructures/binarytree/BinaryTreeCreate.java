package com.uddipta.datastructures.binarytree;

class Node
{
    int data;
    Node right;
    Node left;
}

class BinaryTree
{
    public Node createNewNode(int val)
    {
        Node a = new Node();
        a.data = val;
        a.right = null;
        a.left = null;
        return a;
    }
    public void inOrder(Node nd)
    {
        if(nd == null)
        {
            return;
        }
        inOrder(nd.left);
        System.out.println(nd.data+" ");
        inOrder(nd.right);
    }

    public void preOrder(Node nd)
    {
        if(nd == null)
        {
            return;
        }
        System.out.println(nd.data+" ");
        preOrder(nd.left);
        preOrder(nd.right);
    }

    public void postOrder(Node nd)
    {
        if(nd == null)
        {
            return;
        }
        postOrder(nd.left);
        postOrder(nd.right);
        System.out.println(nd.data+" ");
    }
}


public class BinaryTreeCreate {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        Node root = bt.createNewNode(2);
        root.left = bt.createNewNode(7);
        root.right = bt.createNewNode(5);
        root.left.left = bt.createNewNode(2);
        root.left.right = bt.createNewNode(6);
        root.left.right.left = bt.createNewNode(5);
        root.left.right.right = bt.createNewNode(11);
        root.right.right = bt.createNewNode(9);
        root.right.right.left = bt.createNewNode(4);
        System.out.println("Inorder: ");
        bt.inOrder(root);
        System.out.println("Preorder: ");
        bt.preOrder(root);
        System.out.println("Postorder:");
        bt.postOrder(root);
    }
}
