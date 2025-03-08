package com.datastructure.linkedlist.algorithms;

import com.datastructure.linkedlist.LinkedList;
import com.datastructure.linkedlist.Node;

import java.util.Arrays;

public class RemoveDuplicates {
//    You are given a singly linked list that contains integer values, where some of these values may be duplicated.
//    Note: this linked list class does NOT have a tail which will make this method easier to implement.
//    Your task is to implement a method called removeDuplicates() within the LinkedList class that removes all duplicate values from the list.
//    Your method should not create a new list, but rather modify the existing list in-place, preserving the relative order of the nodes.
//    You can implement the removeDuplicates() method in two different ways:
//    1. Using a Set (HashSet) - This approach will have a time complexity of O(n), where n is the number of nodes in the linked list. You are allowed to use the provided Set data structure in your implementation.
//    2. Without using a Set - This approach will have a time complexity of O(n^2), where n is the number of nodes in the linked list. You are not allowed to use any additional data structures for this implementation.
//    Example:
//    Input:
//    LinkedList: 1 -> 2 -> 3 -> 1 -> 4 -> 2 -> 5
//    Output:
//    LinkedList: 1 -> 2 -> 3 -> 4 -> 5

    public static void removeDuplicates(Node head) {
        if (head == null || head.next == null) return;
        Node slow = head;
        while (slow != null) {
            Node fast = slow.next;
            Node current = slow;
            while (fast != null) {
                if (fast.value == slow.value) {
                    current.next = fast.next;
                    fast = fast.next;
                } else {
                    current = fast;
                    fast  = fast.next;
                }
            }
            slow = slow.next;
        }
    }


    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addAll(Arrays.asList(1,2,3,1,4,2,5));
        ll.printList();
        System.out.println(" ");
        removeDuplicates(ll.getHead());
        ll.printList();
    }
}
