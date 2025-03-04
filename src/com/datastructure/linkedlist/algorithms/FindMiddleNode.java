package com.datastructure.linkedlist.algorithms;

import com.datastructure.linkedlist.LinkedList;
import com.datastructure.linkedlist.Node;

import java.util.Arrays;

public class FindMiddleNode {
    public static Node findMiddleNode(Node head) {
        if (head == null || head.next == null) return null;
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addAll(Arrays.asList(1,2,3,4,5));
        Node middleNode = findMiddleNode(ll.getHead());
        ll.printList();
        System.out.println("-----------------");
        System.out.println("Middle node: " + middleNode.value);
    }
}
