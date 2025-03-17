package com.pattern.slowfastpointer;

import com.datastructure.linkedlist.Node;

public class L234PalindromeLinkedList {
    public boolean isPalindrome(Node head) {
        if (head == null || head.next == null) return true;

        //Find middle node
        Node middleNode = head;
        Node helpNode = head;
        while (helpNode != null && helpNode.next != null) {
            middleNode = middleNode.next;
            helpNode = helpNode.next.next;
        }

        //Reverse half node
        Node prev = null;
        Node current = middleNode;
        while (current != null) {
            Node nextTemp = current.next;
            current.next = prev;
            prev = current;
            current = nextTemp;
        }

        //Compare
        while (prev != null) {
            if (head.value != prev.value) {
                return false;
            }
            head = head.next;
            prev = prev.next;
        }
        return true;
    }
    public static void main(String[] args) {

    }
}
