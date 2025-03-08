package com.pattern.twopointers;

import com.datastructure.linkedlist.LinkedList;
import com.datastructure.linkedlist.Node;

import java.util.Arrays;

public class L83RemoveDuplicatesSortLL {
    public static void removeDuplicates(Node head) {
        if (head == null || head.next == null) return;
        Node current = head;
        while (current != null && current.next != null) {
            if (current.value == current.next.value) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addAll(Arrays.asList(1,1,2,2,5,6,6));
        ll.printList();
        System.out.println(" ");
        removeDuplicates(ll.getHead());
        ll.printList();
    }
}
