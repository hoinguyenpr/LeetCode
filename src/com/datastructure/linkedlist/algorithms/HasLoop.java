package com.datastructure.linkedlist.algorithms;

import com.datastructure.linkedlist.LinkedList;
import com.datastructure.linkedlist.Node;

import java.util.Arrays;

public class HasLoop {
    public static boolean hasLoop(Node head) {
        if (head == null || head.next == null) return false;
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addAll(Arrays.asList(1,2,3,4,5));
        ll.printList();
        // Create loop
        ll.getTail().next = ll.getHead().next.next;
        System.out.println("-----------------");
        System.out.println(hasLoop(ll.getHead()) ? "Has loop" : "Hasn't loop");
    }
}
