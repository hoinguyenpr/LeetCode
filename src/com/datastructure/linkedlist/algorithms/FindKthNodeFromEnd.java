package com.datastructure.linkedlist.algorithms;

import com.datastructure.linkedlist.LinkedList;
import com.datastructure.linkedlist.Node;

import java.util.Arrays;

public class FindKthNodeFromEnd {
//    LL: Find Kth Node From End ( ** Interview Question)
//    Implement a method called findKthFromEnd that returns the k-th node from the end of the list.
//
//    If the list has fewer than k nodes, the method should return null.
//
//    Note: This implementation of the Linked List class does not have the length attribute.

    public static Node findKthFromEnd(Node head, int k) {
        Node slow = head, fast = head;
        for (int i = 0; i < k; i ++) {
            if (fast == null) return null;
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addAll(Arrays.asList(1,2,3,4,5));
        Node node2th = findKthFromEnd(ll.getHead(), 2);
        Node node5th = findKthFromEnd(ll.getHead(), 5);
        Node node6th = findKthFromEnd(ll.getHead(), 6);

        ll.printList();
        System.out.println("-----------------");
        System.out.println("2th node: " + node2th.value);
        System.out.println("5th node: " + node5th.value);
        System.out.println("6th node: " + node6th);
    }
}
