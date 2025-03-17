package com.datastructure.doublydlinkedlist.algorithms;

import com.datastructure.doublydlinkedlist.DoublyLinkedList;
import com.datastructure.doublydlinkedlist.Node;

//Implement a method called swapPairs within the class that swaps the values of adjacent nodes in the linked list.
// The method should not take any input parameters.
public class SwapPairs {
    public static Node swapPairs(DoublyLinkedList dll) {
        if (dll.getLength() <= 1) return dll.getHead();
        Node first = dll.getHead();
        Node head = first.next;
        while (first != null && first.next != null) {
            Node second = first.next;
            if (second.next != null) second.next.prev = first;
            if (first.prev != null) first.prev.next = second;
            first.next = second.next;
            second.prev = first.prev;
            second.next = first;
            first.prev = second;
            first = first.next;
        }
        return head;
    }

    public static void main(String[] args) {
        DoublyLinkedList dll =
                new DoublyLinkedList(1);
        dll.append(2);
        dll.append(3);
        dll.append(4);
        Node result = swapPairs(dll);
        while (result != null) {
            System.out.print(result.value + " ");
            result = result.next;
        }
    }
}
