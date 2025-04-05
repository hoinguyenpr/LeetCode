package com.datastructure.bst.algorithms;

public class BinarySearchTree {
    private Node root;
    class Node {
        private int value;
        private Node left;
        private Node right;

        Node(int value) {
            this.value = value;
        }
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) root = newNode;
        Node temp = root;
        while (true) {
            if (value == temp.value) return true;
            if(value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    public boolean contains(int value) {
        if (root == null) return false;
        Node temp = root;
        while (temp != null) {
            if (value == temp.value) return true;
            if (value < temp.value) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        BinarySearchTree myBST = new BinarySearchTree();
        myBST.insert(5);
        System.out.println(myBST.root.value);
    }
}
