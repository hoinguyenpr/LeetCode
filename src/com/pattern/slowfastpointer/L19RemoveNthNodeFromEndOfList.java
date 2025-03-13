package com.pattern.slowfastpointer;

import com.datastructure.linkedlist.LinkedList;
import com.datastructure.linkedlist.Node;

import java.util.Arrays;

public class L19RemoveNthNodeFromEndOfList {
    public static void removeNthFromEnd(Node head, int n) {
        Node slow = head, fast = head, current = head;
        for (int i = 0; i < n; i ++) {
            if (fast == null) return;
            fast = fast.next;
        }
        if (fast == null) {
            head = head.next;
        } else {
            while (fast != null) {
                fast = fast.next;
                current = slow;
                slow = slow.next;
            }
            current.next = slow.next;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addAll(Arrays.asList(1,2));
        ll.printList();
        System.out.println(" ");
        removeNthFromEnd(ll.getHead(), 2);
        ll.printList();
    }
}
