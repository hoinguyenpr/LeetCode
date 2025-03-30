package com.datastructure.stack;

public class Stack {
    private Node top;
    private int height;

    public Stack(int value) {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    public void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.value + "  ");
            temp = temp.next;
        }
    }

    public void getTop() {
        System.out.println("Top: " + top.value);
    }

    public void getHeight() {
        System.out.println("Height: " + height);
    }

    public void push(int value) {
        Node newNode = new Node(value);
        if (height == 0) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        height ++;
    }
    public Node pop() {
        if (height == 0) return null;

        Node temp = top;
        top = top.next;
        temp.next = null;

        height --;
        return  temp;
    }

    public static void main(String[] args) {
        Stack myStack = new Stack(4);
        myStack.getTop();
        myStack.getHeight();
        myStack.printStack();

        System.out.println("Push");
        myStack.push(5);
        myStack.push(6);
        myStack.push(7);

        myStack.getTop();
        myStack.getHeight();
        myStack.printStack();


        System.out.println("Pop");
        myStack.pop();

        myStack.getTop();
        myStack.getHeight();
        myStack.printStack();


    }
}
