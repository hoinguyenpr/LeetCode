package com.datastructure.linkedlist.algorithms;

//In the LinkedList class, implement a method called reverseBetween that reverses the nodes of the list between indexes startIndex and endIndex (inclusive).
//It's important to note that you should only rearrange the nodes themselves, not just their values.
//Note:  The Linked List does NOT have a tail which will make the implementation easier.
//Assumption: You can assume that startIndex and endIndex are not out of bounds.
//The method should have the following signature:
//public void reverseBetween(int m, int n) {
//    // Your implementation here
//}
//The method should not return any value, and it should modify the original linked list.
//The positions startIndex and endIndex are 0-indexed.
//        Example:
//Given the following linked list:
//        1 -> 2 -> 3 -> 4 -> 5
//Calling reverseBetween(1, 3) should result in the following modified linked list:
//        1 -> 4 -> 3 -> 2 -> 5
//I highly recommend that you draw the Linked List out on a piece of paper so you can visualize the steps.
//        Notes:
//The method should not duplicate any of the existing nodes, only rearranging the existing nodes in the list.
//        However, the creation of a limited number of new nodes is allowed (e.g., dummy nodes to facilitate the partitioning process).
//The method should not use any extra data structures such as arrays or lists.


import com.datastructure.linkedlist.LinkedList;
import com.datastructure.linkedlist.Node;

import java.util.Arrays;

public class ReverseBetween {
    public static Node reverseBetween(int m, int n, Node head) {
        if (m==n) return head;
        Node left = null;
        Node right = null;
        Node preLeft = null;
        Node current = head;
        for (int i = 1; i <= n; i ++) {
            if (m == 1) {
                left = head;
            } else if (i == m-1){
                preLeft = current;
                left = current.next;
            }
            if (i == n) right = current;
            if (current == null) return head;
            current = current.next;
        }
        Node stopPoint = right.next;
        current = left;
        Node prev = right.next;
        while(current != stopPoint) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        if (left != head) {
            preLeft.next = right;
        } else {
            head = right;
        }
        return head;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addAll(Arrays.asList(1,2,3,4,5));
        ll.printList();
        System.out.println(" ");
        Node result = reverseBetween(1,5,ll.getHead());
        while (result != null) {
            System.out.print(result.value + " ");
            result = result.next;
        }
    }

}


