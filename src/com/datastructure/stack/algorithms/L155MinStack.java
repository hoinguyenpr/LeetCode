package com.datastructure.stack.algorithms;

import java.util.Stack;

public class L155MinStack {
    private Node top;
    private Stack<Integer> minStack;

    public L155MinStack() {
        minStack = new Stack<>();
    }

    class Node {
        private int val;
        private Node next;

        Node(int val) {
            this.val = val;
        }
    }

    void push(int val) {
        Node newNode = new Node(val);
        newNode.next = top;
        top = newNode;
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    void pop() {
        if (top == null) return;
        if (top.val == minStack.peek()) {
            minStack.pop();
        }
        top = top.next;
    }

    int top() {
        return top.val;
    }

    int getMin() {
        return !minStack.isEmpty() ? minStack.peek() : 0;
    }

    public static void main(String[] args) {
        L155MinStack testMinStack = new L155MinStack();
        System.out.println("minStack.getMin(): " +  testMinStack.getMin());;
        testMinStack.push(2);
        testMinStack.push(0);
        testMinStack.push(3);
        testMinStack.push(0);

        System.out.println("minStack.getMin(): " + testMinStack.getMin());;
        testMinStack.pop();
        System.out.println("minStack.top(): " + testMinStack.top());;
        System.out.println("minStack.getMin(): " +  testMinStack.getMin());;
    }
}
